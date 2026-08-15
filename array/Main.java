package array;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    // Flip to false only if your judge somehow sets this system property (it normally won't).
    private static final boolean LOCAL = System.getProperty("ONLINE_JUDGE") == null;
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader(System.in);
        StringBuilder out = new StringBuilder();

        int t = in.nextInt();
        while (t-- > 0) {
            solve(in, out);
        }

        System.out.print(out);
    }

    private static void solve(FastReader in, StringBuilder out) {
        // --- Write algorithm logic below ---
        int n = in.nextInt();
        long[] a = in.nextLongArray(n);

        out.append(Arrays.toString(a)).append('\n');
    }

    // ---------------- Debug ----------------
    private static void dbg(Object... o) {
        if (!LOCAL) return;
        StringBuilder sb = new StringBuilder("[DEBUG] ");
        for (Object obj : o) sb.append(deepToString(obj)).append(' ');
        System.err.println(sb.toString().trim());
    }

    private static String deepToString(Object o) {
        if (o == null) return "null";
        if (o instanceof int[]) return Arrays.toString((int[]) o);
        if (o instanceof long[]) return Arrays.toString((long[]) o);
        if (o instanceof double[]) return Arrays.toString((double[]) o);
        if (o instanceof boolean[]) return Arrays.toString((boolean[]) o);
        if (o instanceof Object[]) return Arrays.deepToString((Object[]) o);
        return o.toString();
    }

    // ---------------- Math / array helpers ----------------

    // Codeforces can hack Arrays.sort(int[]/long[]) since it's deterministic dual-pivot
    // quicksort with no randomization. Shuffle first to defend against O(n^2) hacks.
    static void safeSort(int[] a) {
        int n = a.length;
        Random rnd = new Random(715);
        for (int i = 0; i < n; i++) {
            int j = i + rnd.nextInt(n - i);
            int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
        }
        Arrays.sort(a);
    }

    static void safeSort(long[] a) {
        int n = a.length;
        Random rnd = new Random(715);
        for (int i = 0; i < n; i++) {
            int j = i + rnd.nextInt(n - i);
            long tmp = a[i]; a[i] = a[j]; a[j] = tmp;
        }
        Arrays.sort(a);
    }

    static long gcd(long a, long b) {
        while (b != 0) { long t = b; b = a % b; a = t; }
        return a;
    }

    static long power(long base, long exp, long mod) {
        base %= mod;
        if (base < 0) base += mod;
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) res = res * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return res;
    }

    // ---------------- Union-Find ----------------
    static class DSU {
        int[] parent, rank_;
        DSU(int n) {
            parent = new int[n];
            rank_ = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
        boolean union(int a, int b) {
            int ra = find(a), rb = find(b);
            if (ra == rb) return false;
            if (rank_[ra] < rank_[rb]) { int t = ra; ra = rb; rb = t; }
            parent[rb] = ra;
            if (rank_[ra] == rank_[rb]) rank_[ra]++;
            return true;
        }
    }

    // ---------------- Fast input ----------------
    static class FastReader {
        private static final int BUFFER_SIZE = 1 << 16;
        private final DataInputStream din;
        private final byte[] buffer;
        private int bufferPointer, bytesRead;

        FastReader(InputStream is) {
            din = new DataInputStream(is);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        private byte readByte() throws IOException {
            if (bufferPointer == bytesRead) {
                bytesRead = din.read(buffer, 0, BUFFER_SIZE);
                bufferPointer = 0;
                if (bytesRead == -1) return -1;
            }
            return buffer[bufferPointer++];
        }

        int nextInt() {
            try {
                int ret = 0;
                byte b = readByte();
                while (b <= ' ') b = readByte();
                boolean neg = b == '-';
                if (neg) b = readByte();
                while (b >= '0' && b <= '9') {
                    ret = ret * 10 + b - '0';
                    b = readByte();
                }
                return neg ? -ret : ret;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        long nextLong() {
            try {
                long ret = 0;
                byte b = readByte();
                while (b <= ' ') b = readByte();
                boolean neg = b == '-';
                if (neg) b = readByte();
                while (b >= '0' && b <= '9') {
                    ret = ret * 10 + b - '0';
                    b = readByte();
                }
                return neg ? -ret : ret;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String next() {
            try {
                StringBuilder sb = new StringBuilder();
                byte b = readByte();
                while (b <= ' ') b = readByte();
                while (b > ' ') {
                    sb.append((char) b);
                    b = readByte();
                }
                return sb.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                byte b = readByte();
                while (b != '\n' && b != -1) {
                    if (b != '\r') sb.append((char) b);
                    b = readByte();
                }
                return sb.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }
}