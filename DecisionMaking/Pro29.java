//29. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three
package DecisionMaking;

import java.util.Scanner;

public class Pro29 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age1=sc.nextInt();//Ram
        int age2=sc.nextInt();//Shyam
        int age3= sc.nextInt();//Ajay
        if(age1 < age2 && age1 < age3){
            System.out.println("Ram is Youngest");
        } else if (age2 < age1 && age2<age3) {
            System.out.println("Shyam is Youngest");

        }
        else {
            System.out.println("Ajay is Youngest");
        }
    }


}
