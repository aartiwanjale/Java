

//14. Write a program to input angles of a triangle and check whether triangle is valid or not
package DecisionMaking;

import java.util.Scanner;

public class Pro14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angles of a Triangle:");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        int total = angle1 + angle2 + angle3;
        if (total == 180) {
            System.out.println("This is the Triangle");
        } else {
            System.out.println("This is the not Triangle");
        }
    }
}