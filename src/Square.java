import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printSquareWithDiagonals();
    }
    public static void printSquareWithDiagonals() {
        System.out.println("# # # # # # #");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i == 6 - j) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("#");
        }
        System.out.println("# # # # # # #");
    }
}
