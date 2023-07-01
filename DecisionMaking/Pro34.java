//34. A library charges a fine for every book returned late.
//        For first 5 days the fine is 50 paise, f
//        or 6-10 days fine is one rupee and above 10 days fine is 5 rupees.
//        If you return the book after 30 days your membership will be cancelled.
//        Write a program to accept the number of days the member is late to return
//        the book and display the fine or the appropriate message
package DecisionMaking;

import java.util.Scanner;

public class Pro34 {
    public static void main(String[] args) {
        int day;
        double fine;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day:");
        day = sc.nextInt();
        if (day <= 5) {
            fine = 0.5 * day;
            System.out.println("Total Amount  fine:" + fine);
        } else if (day >=6 && day <= 10) {
            fine = 1 * day;
            System.out.println("Total Amount fine:" + fine);
        } else if (day <= 30) {
            fine = 5 * day;
            System.out.println("Total Amount  fine:" + fine);
        } else {
            System.out.println("If you return the book after 30 days your membership will be cancelled");
        }
    }


}
