public class Letters {
    public static void main(String[] args) {
        printLetterS();
        System.out.println();
        printLetterZ();
        System.out.println();
        printHourglass();

    }

    public static void printLetterS() {
        System.out.println("# # # # # # #");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.println("#");
        }
        System.out.println("# # # # # # #");
    }

    public static void printLetterZ() {
        System.out.println("# # # # # # #");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.println("#");
        }
        System.out.println("# # # # # # #");
    }

    public static void printHourglass() {
        System.out.println(" # # # # # # #");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.print("#");
            for (int j = 1; j <= 8 - 2 * i; j++) {
                System.out.print("  ");
            }
            System.out.println("#");
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.print("#");
            for (int j = 1; j <= 8 - 2 * i; j++) {
                System.out.print("  ");
            }
            System.out.println("#");
        }
        System.out.println(" # # # # # # #");
    }


}
