
//40. Write a Java program to check whether the given integer is a multiple of 5
package DecisionMaking;

import java.util.Scanner;

public class Pro40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        if (a % 5 == 0) {
            System.out.println("Number is multiple of 5:" + a);
        } else {
            System.out.println("Number is  not multiple of 5: " + a);
        }
    }
}


