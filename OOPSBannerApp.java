public class OOPSBannerApp {
<<<<<<< HEAD
    public static void main(String[] args) {

        String[] lines = new String[7];

        lines[0] = "  ***    ***    *****   ***** ";
        lines[1] = " *   *  *   *   *    *  *     ";
        lines[2] = "*     **     *  *    *  *     ";
        lines[3] = "*     **     *  *****   ***** ";
        lines[4] = "*     **     *  *           * ";
        lines[5] = " *   *  *   *   *           * ";
        lines[6] = "  ***    ***    *       ***** ";

        for (String line:lines) {
            System.out.println(line);
        }
    }
}
=======

    public static void main(String[] args) {

        String[] banner = {
            String.join("   ", " ***** ", " ***** ", " **** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*   *", "*     "),
            String.join("   ", "*     *", "*     *", "**** ", " *** "),
            String.join("   ", "*     *", "*     *", "*    ", "    *"),
            String.join("   ", "*     *", "*     *", "*    ", "    *"),
            String.join("   ", "*     *", "*     *", "*    ", "    *"),
            String.join("   ", " ***** ", " ***** ", "*    ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
>>>>>>> UC5-Array-Init
