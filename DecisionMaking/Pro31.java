

//31. Find the absolute value of a number entered through the keyboard

package DecisionMaking;

import java.util.Scanner;
//import java.math.*;

public class Pro31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        int val=Math.abs(a);
        System.out.println("Absolute Value "+val);
    }
}
