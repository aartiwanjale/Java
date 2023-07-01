//25. The marks obtained by a student in 5 different subjects are input through the keyboard. The student gets a division as per the following rules: Write a program to calculate the division obtained by the student
//
//        Percentage above or equal to 60 - First division
//        Percentage between 50 and 59 - Second division
//        Percentage between 40 and 49 - Third division
//        Percentage less than 40 – Fail
package DecisionMaking;

import java.util.Scanner;

public class Pro25 {
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

        System.out.println("Total Marks:" + total);
        float per = (float) ((total / 500)*100);
        System.out.println("Percentage:"+per);

        if (per >= 60 ) {
            System.out.println("First Division");
        } else if (per > 50 && per<=59) {
            System.out.println("second division");
        } else if (per >40 && per<=49) {
            System.out.println("Third division");
        }
        else{
            System.out.println("Fail");
    }
}
}
