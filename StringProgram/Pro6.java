package StringProgram;

public class Pro6 {
    public static void main(String[] args) {
        String s= new String("JDBC");
        String s2= new String("Hiberenate");
        String s3="Data Base ";
        String s1="Heap Memory ";
        String s4="JDBC";
        System.out.println(s2==s3);//false
        System.out.println(s.equals(s4));//true
        System.out.println(s4==s);//false
        System.out.println(s==s1);//false
    }
}
