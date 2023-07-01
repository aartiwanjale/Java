//19. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

//        Percentage >= 90% : Grade A
//        Percentage >= 80% : Grade B
//        Percentage >= 70% : Grade C
//        Percentage >= 60% : Grade D
//        Percentage >= 40% : Grade E
//        Percentage < 40% : Grade F
package DecisionMaking;

import java.util.Scanner;

public class Pro19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Marks:");
        int mar1 = sc.nextInt();
//        System.out.println("Enter the ChemistryMarks:");
        int mar2 = sc.nextInt();
//        System.out.println("Enter the Biology Marks:");
        int mar3 = sc.nextInt();
//        System.out.println("Enter the Mathematics Marks:");
        int mar4 = sc.nextInt();
//        System.out.println("Enter the Computer Marks:");
        int mar5 = sc.nextInt();

        double total = mar1 + mar2 + mar3 + mar4 + mar5;

        System.out.println("Total Marks" + total);
        double per = (total / 5);

        if (per >= 90) {
            System.out.println("Grade A");
        } else if (per >= 80) {
            System.out.println("Grade B");
        } else if (per >= 70) {
            System.out.println("Grade C");
        } else if (per >= 60) {
            System.out.println("Grade D");
        } else if (per >= 50) {
            System.out.println("Grade E");
        } else if (per < 40) {
            System.out.println("Grade F");
        }
    }
}
