package DecisionMaking;

import java.util.Scanner;

//5. Write a program to check whether a number is even or odd
public class Pro5 {
    public static void main(String[] args) {
//        int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        if(a % 2==0)
        {
            System.out.println("Number is Even:"+a);
        }
        else
        {
            System.out.println("Number is Odd:"+a);
        }
    }
}
