package DecisionMaking;

import java.util.Scanner;

public class Pro28 {


        public static void main(String[] args) {

//            int number = 12;
//            int rev=0;
            int num,ori,rem,rev=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            num = sc.nextInt();
            ori=num;

            while (num> 0) {
                rem=num%10;
                rev=(rev*10)+rem;
                num=num/10;
            }
                if (ori==rev) {

                    System.out.println("The number is equal to its reverse:"+ori);
                } else {
                    System.out.println("The number is  not equal to its reverse:"+ori);
                }
            }
        }







