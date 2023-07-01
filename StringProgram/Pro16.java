package StringProgram;

import java.util.Arrays;

public class Pro16 {
    public static void main(String[] args) {
        String str="Java is a Oops Language";
        String temp=" ";
        String a[]=str.split(" ");
        for(int i=a.length-1;i>=0;i--){

             temp=temp+a[i]+" ";

        }
      for (int i=temp.length()-1;i>=0;i--)
        {
            System.out.print(temp.charAt(i));
        }
    }
}
