
//13. Write a program to count total number of notes in given amount
package DecisionMaking;

import java.util.Scanner;

public class Pro13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
        int amt = sc.nextInt();
//     int amt = 5050;
        int n = 500, n1 = 100, n2 = 50;
                int n3 = 0, n4 = 0, n5 = 0,n31=0;
        if (amt >= 500){
            n3 = amt / 500;

//        amt -= n3 * 500;
    }
        if (amt >= 100) {
            n4 = amt / 100;
            amt -= n4 * 100;
        }
        if(amt>=50){
            n5= amt/50;
            amt -=n5*50;
        }
//        else {
//            System.out.println("Amount is not print");
//        }


        System.out.println("Total Number of Notes");
        System.out.println("500 = " + n3);
        System.out.println("100 = " + n4);
        System.out.println("50 = " + n5);
    }
}
