//9. Write a program to input any character and check whether it is alphabet, digit or special character
package DecisionMaking;

import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user:");
  char c = sc.next().charAt(0);
//        int a=sc.nextInt();
//        int c1=sc.nextInt();
//        double c=sc.nextDouble();
//        String c= sc.next();

        if(c>='a' && c <='z'|| c>='A' && c<='Z'){
           System.out.println("This is Alpabet:"+c);

        }
        else if (c>='0' && c<='9') System.out.println("This is the digit:" + c);
        else {
            System.out.println("This is the Special Character");
        }
    }


}
