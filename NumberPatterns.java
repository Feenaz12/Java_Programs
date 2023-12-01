package Assignments;

public class NumberPatterns {
   

    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        printPattern1(4);

        System.out.println("\nPattern 2:");
        printPattern2(4);

        System.out.println("\nPattern 3:");
        printPattern3(4);

        System.out.println("\nPattern 4:");
        printPattern4(3);

        System.out.println("\nPattern 5:");
        printPattern5(4);

        System.out.println("\nPattern 6:");
        printPattern6(5);

        System.out.println("\nPattern 7:");
        printPattern7(5);

        System.out.println("\nPattern 8:");
        printPattern8(5);

      
    }

    static void printPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void printPattern2(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void printPattern3(int n) {
        for (int i = 0; i < n; i++) {
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    static void printPattern4(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void printPattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void printPattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void printPattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k + " ");
            }
            for (int l = i; l > 0; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }    


static void printPattern8(int n) {
	int rows = 2 * n - 1;
    int columns = 2 * n - 1;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(n - Math.min(Math.min(i, j), Math.min(rows - 1 - i, columns - 1 - j)) + " ");
        }
        System.out.println();
    }
}
}