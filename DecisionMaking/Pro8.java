//8. Write a program to input any alphabet and check whether it is vowel or consonant
package DecisionMaking;

import java.util.Scanner;

public class Pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char c = sc.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("This is the Vowel");
        } else {
            System.out.println("This is the Consonant");
        }
    }
}
