//
//20. Write a program to input basic salary of an employee and calculate its Gross salary according to following:
//
//        Basic Salary <= 10000 : HRA = 20%, DA = 80%
//        Basic Salary <= 20000 : HRA = 25%, DA = 90%
//        Basic Salary > 20000 : HRA = 30%, DA = 95%
package DecisionMaking;

import java.util.Scanner;

public class Pro20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
        double Salary = sc.nextInt();
        double hr, da, total;
        if (Salary <= 10000) {
            hr = Salary * 0.2;
            da = Salary * 0.8;
            total = Salary + hr + da;
            System.out.println("Total Salary " + total);

        } else if (Salary <= 20000) {
            hr = Salary * 0.25;
            da = Salary * 0.9;
            total = Salary + hr + da;
            System.out.println("Total Salary " + total);
        } else if (Salary > 20000) {
            hr = Salary * 0.3;
            da = Salary * 0.95;
            total = Salary + hr + da;
            System.out.println("Total Salary " + total);
        }
    }

    }
