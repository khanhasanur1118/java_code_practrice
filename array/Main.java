package array;

import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    // Set LOCAL to false before submitting if your platform doesn't strip custom JVM args
    private static final boolean LOCAL = System.getProperty("ONLINE_JUDGE") == null;

    public static void main(String[] args) {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            solve(i, in, out);
        }

        out.flush();
    }

    private static void solve(int testCase, FastScanner in, PrintWriter out) {
        // --- Write algorithm logic below ---

    }

    // --- PRO DEBUG UTILITY (Inlined for zero runtime overhead on OJ) ---
    private static void dbg(Object... o) {
        if (!LOCAL) return;
        StringBuilder sb = new StringBuilder("[DEBUG] ");
        for (Object obj : o) {
            sb.append(deepToString(obj)).append(" ");
        }
        System.err.println(sb.toString().trim());
    }

    private static String deepToString(Object o) {
        if (o == null) return "null";
        if (o instanceof int[]) return java.util.Arrays.toString((int[]) o);
        if (o instanceof long[]) return java.util.Arrays.toString((long[]) o);
        if (o instanceof double[]) return java.util.Arrays.toString((double[]) o);
        if (o instanceof boolean[]) return java.util.Arrays.toString((boolean[]) o);
        if (o instanceof Object[]) return java.util.Arrays.deepToString((Object[]) o);
        return o.toString();
    }

    // --- HIGH-PERFORMANCE CUSTOM BYTE-BUFFER SCANNER ---
    static class FastScanner {
        private final InputStream stream;
        private final byte[] buffer = new byte[1 << 17]; // 128KB buffer
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (head >= tail) {
                head = 0;
                try {
                    tail = stream.read(buffer, 0, buffer.length);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public String next() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return null;
                c = read();
            }
            StringBuilder res = new StringBuilder();
            while (c > ' ') {
                res.appendCodePoint(c);
                c = read();
            }
            return res.toString();
        }

        public int nextInt() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) throw new InputMismatchException();
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) throw new InputMismatchException();
                c = read();
            }
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return res * sgn;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }
}