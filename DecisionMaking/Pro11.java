
//11. Write a program to input week number and print week day
package DecisionMaking;

import java.util.Scanner;

public class Pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day:");
        int day= sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wanesday");
                break;
            case 4:
                System.out.println("Thueday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saterday");
                break;
            default:
                System.out.println("Sunday is a Week day");

        }

        }
}
