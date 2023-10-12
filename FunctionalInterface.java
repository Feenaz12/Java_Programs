package Feenaz;
import java.util.*;

interface Test1 {
    int fact(int n);
}

interface Test2 {
    int large(int a,int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        
        Test1 factorial = (n) -> {
            if (n == 0) {
                return 1;
            } else {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result = result*i;
                }
                return result;
            }
        };

        int number = 4;
        System.out.println("Factorial of " + number + " is: " + factorial.fact(number));

        Test2 large = (a, b) -> (a > b)?a:b;

        int num1 = 70;
        int num2 = 20;
        System.out.println("The largest of " + num1 + " and " + num2 + " is: " + large.large(num1, num2));
    }
}


 