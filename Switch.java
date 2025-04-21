package java_proj_1;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        int operator, n1, n2;
        System.out.println("\n  1 - Add \n  2 - Subtract \n  3 - Divide \n  4 - Multiply \n");
        System.out.println("Enter your choice operator!");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter first number");
        n1 = sc.nextInt();
        System.out.println("Enter second number");
        n2 = sc.nextInt();
        int result = 0;

        switch(operator) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 / n2;
                break;

            case 4:
                result = n1 * n2;
                break;

            default:
                System.out.println("Invalid input. Enter a valid operator");
        }

        System.out.println("Operation result " + result);

    }

}