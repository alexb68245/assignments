import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        printMultiplicationTable(number);
        //printUntil100();
    }

    public static void printUntil100(){
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(" " + (i * j));
            }
            System.out.println();
        }
    }





    public static void printMultiplicationTable(int n) {
        // Print the top border
        printBorder(n);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("| " + (i * j) + " ");
            }
            System.out.println("|");
            printBorder(n);
        }
    }

    public static void printBorder(int n) {
        System.out.print("+");
        for (int i = 0; i <= n; i++) {
            System.out.print("---+");
        }
        System.out.println();
    }
    }
