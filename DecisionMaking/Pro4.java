package DecisionMaking;

import java.util.Scanner;

//4. Write a program to check whether a number is divisible by 5 and 11 or not
public class Pro4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number:");
       int a = sc.nextInt();
//        int a=50;
        if(a%5==0){
            System.out.println("Number is Divisible by 5");
        }
        else if (a%11==0){
            System.out.println("Number is Divisible by 11");
        }
        else {
            System.out.println("Number is not Found");
        }
    }

}
