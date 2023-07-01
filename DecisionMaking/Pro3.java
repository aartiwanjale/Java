package DecisionMaking;
import java.util.Scanner;
//3. Write a program to check whether a number is negative, positive or zero
public class Pro3 {
    public static void
    main(String[] args) {
       //int a = 0;
        //int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your Number:");
        int a= sc.nextInt();



        if (a > 0) {
            System.out.println("Number is Positive:" + a);
        } else if (a < 0) {
            System.out.println("Number is Negetive:" + a);
        } else {
            System.out.println("Number is zero:" + a);
        }

    }

}
