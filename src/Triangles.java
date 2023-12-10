import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int size = scanner.nextInt();


        printTriangle1(size);
        System.out.println();
        printTriangle2(size);
        System.out.println();
        printTriangle3(size);
        System.out.println();
        printTriangle4(size);
    }

    public static void printTriangle1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printTriangle2(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void printTriangle3(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printTriangle4(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
