

//30. Write a program to check whether a triangle is valid or not,
// when the three angles of the triangle are entered through the keyboard.
// A triangle is valid if the sum of all the three angles is equal to 180 degrees

package DecisionMaking;

import java.util.Scanner;

public class Pro30 {
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
