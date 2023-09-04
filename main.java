public class main {
    public static void main(String[] args) {
        int base = 3;
        int expo = 5;
        int i = 1;
        int actual = 0;
        recursiMulti(base, expo, i, actual);
        recursiSuma(base, expo, i, actual);
    }

    public static void recursiMulti(int base, int expo, int i, int actual) {

        // 3 * 3 * 3 * 3 * 3
        // 3 * 3
        // 9 * 3
        // 27 * 3
        // 81 * 3
        // 243
        if (i == 1) {
            actual = base * base;
        } else {
            actual = actual * base;
        }
        System.out.println("Recursividad Multi: " + actual);
        i++;
        if (i == expo) {
            return;
        }
        recursiMulti(base, expo, i, actual);
    }

    public static void recursiSuma(int base, int expo, int i, int actual) {

        // 3 * 3 * 3 * 3 * 3
        // 3 * 3
        // 9 * 3
        // 27 * 3
        // 81 * 3
        // 243

        /**
         * 3 * 3
         * 3 + 3 + 3 = 9
         * 9 * 3
         * 9 + 9 + 9 = 27
         * 27 * 27 * 27 = 81
         * 81 * 81 * 81
         */

        if (i == 1) {
            actual = base + base + base;
        } else {
            actual = actual + actual + actual;
        }
        System.out.println("Recursividad Suma: " + actual);
        i++;
        if (i == expo) {
            return;
        }
        recursiSuma(base, expo, i, actual);

    }

}
