
//37. Write a Java program that reads an positive integer and count the number of digits

        package DecisionMaking;

import java.util.Scanner;

public class Pro37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            a = a / 10;
            ++count;
        }
        if (a > 0) {

            while (a != 0) {
                a = a / 10;
                ++count;
            }

        System.out.println("Number is positive ");
        System.out.println("total digit " + count);
    }

            else if (a < 0) {
                System.out.println("Number is negetive ");
                System.out.println("total digit " + count);
            }
        }
    }

//        else {
//            System.out.println("Number is not found");
//        }


