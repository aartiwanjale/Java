package StringProgram;

public class Pro10 {
    public static void main(String[] args) {
        String s= new String("Table");
        String s2= new String("Table");
        String s3="One to One ";
        String s1= "One to Many  ";
        String s4="Many to one ";
        System.out.println(s2==s1);//false
        System.out.println(s.equals(s2));//true
        System.out.println(s4==s3);//false
        System.out.println(s==s3);//false
    }
}
