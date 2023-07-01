package StringProgram;

public class Pro2 {
    public static void main(String[] args) {
        String s= new String("Aarti");
        String s2= new String("Java");
        String s3="Java";
        String s1="Java";
        String s4="Java Program";
        System.out.println(s==s1);//false
        System.out.println(s.equals(s3));//false
        System.out.println(s3==s1);//true
        System.out.println(s4==s2);//false
    }
    }

