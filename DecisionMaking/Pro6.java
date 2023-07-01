//6. Write a program to check whether a year is leap year or not
package DecisionMaking;

import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int year = sc.nextInt();
        if(year %4==0)
        {
            System.out.println("Year is leap:"+year);
        }
        else {
            System.out.println("Year Is not leap:"+year);
        }
    }
}
