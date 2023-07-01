package StringProgram;

public class Pro9 {
    public static void main(String[] args) {
        String s= new String("JDBC");
        String s2= new String("Java");
        String s3="Java Programming ";
        String s1="Heap Memory ";
        String s4="JDBC";
        System.out.println(s1==s2);//false
        System.out.println(s.equals(s2));//false
        System.out.println(s3==s2);//false
        System.out.println(s4==s3);//false
    }
}
