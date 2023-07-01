//32. Given the length and breadth of a rectangle,
// write a program to find whether the area of the rectangle is greater than its perimeter.
// For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter
package DecisionMaking;

import java.util.Scanner;

public class Pro32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angles of a Triangle:");
        int l = sc.nextInt();
        int w = sc.nextInt();

        double rect = l + w;
        double prei = 2 * (l + w);
        System.out.println("Area of Rectangle:" + rect);
        System.out.println("Area of perimeter:" + prei);
        if (rect > prei) {
            System.out.println("Area of rectangle is greater than it's perimeter");
        } else {
            System.out.println("Area of rectangle is greater than it's perimeter");
        }

    }
}
