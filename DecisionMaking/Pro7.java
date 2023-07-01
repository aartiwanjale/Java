
//7. Write a program to check whether a character is alphabet or no
package DecisionMaking;

import java.util.Scanner;

public class Pro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char c = sc.next().charAt(0);
//        if(c>='a' && c<='z' || c>='A' && c<='Z'){
//            System.out.println("Character is Alpabet");
//        }
//        else {
//            System.out.println("This is not Alpabet");
//        }
//
//
//        }
        if (c >= 'a' && c <= 'z') {
            System.out.println("This is the Small Alpabet");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("This is the Capital alapabet");
        } else {
            System.out.println("This is not Alpabet");
        }
    }
}



