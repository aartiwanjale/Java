//36. Write a Java program that accepts three numbers and check All numbers are equal or not
package DecisionMaking;

import java.util.Scanner;

public class Pro36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if (a==b && a==c)
        {
            System.out.println("Number is Equal");
        }
        else if (b==a && b==c) {
            System.out.println("Number is EquAL");
        }
        else {
            System.out.println("Number is not equal");
        }
    }

}
