//18. Write a program to calculate profit or loss
package DecisionMaking;

import java.util.Scanner;

public class Pro18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  cost:");
        double co = sc.nextDouble();
        System.out.println("Enter the selling amount");
        double so = sc.nextDouble();

//        double selling_p = 0, amo = 0;
//        po=selling_p-co;
//        double lo = co - selling_p;
        if (so > co) {
            int a= (int) (so-co);
            System.out.println("Profit:"+a);
        } else if (so < co) {
            double b=(int)(so-co) ;
            System.out.println("Lose:"+b);
        } else {
            System.out.println(" not profit & Not loss");
        }
    }
}
