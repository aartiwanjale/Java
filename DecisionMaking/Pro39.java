
//39. Write a Java program to create a simple calculator
package DecisionMaking;

import java.util.Scanner;

public class Pro39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("JAVA CALCULATOR");
        System.out.println(".....................JAVA CALCULATOR..................");
        System.out.println("Enter Number a & b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1. Addition:");
        System.out.println("2. Subtraction:");
        System.out.println("3. Multiplication:");
        System.out.println("4. Division:");
        System.out.println("5. Modules:");
        int ch= sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int ch= sc.nextInt();
        int Result;

        switch ( ch) {
            case 1:
                Result = a + b;
                System.out.println("Addition:" + Result);
                break;
            case 2:
                Result = a - b;
                System.out.println("Subtraction:" + Result);
                break;
            case 3:
                Result = a * b;
                System.out.println("Multiplication:" + Result);
                break;
            case 4:
                Result = a / b;
                System.out.println("Division:" + Result);
                break;
            case 5:
                Result = a % b;
                System.out.println("Modules:" + Result);
                break;
            default:
                System.out.println("Input is not vaild");


        }
    }
}
