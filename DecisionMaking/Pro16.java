
//16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
package DecisionMaking;

import java.util.Scanner;

public class Pro16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  equilateral, isosceles or scalene triangle ");
        int eq= sc.nextInt();
        int iso= sc.nextInt();
        int sca= sc.nextInt();
        if(eq==iso && iso==sca){
            System.out.println("equilateral Triangle");
        } else if (eq == iso || iso==sca || eq==sca) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
