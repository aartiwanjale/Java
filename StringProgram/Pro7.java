package StringProgram;

public class Pro7 {
    public static void main(String[] args) {
        String s= new String("one to many");
        String s2= new String("Java");
        String s3="Java Databases Conectiving  ";
        String s1="one to one  ";
        String s4="one to many ";
        System.out.println(s2==s);//false
        System.out.println(s.equals(s4));//false
        System.out.println(s1==s3);//false
        System.out.println(s==s3);//false
    }
}
