package StringProgram;

public class Pro8 {
    public static void main(String[] args) {
        String s= new String("JDBC");
        String s2= new String("Java");
        String s3="Java ";
        String s1="Heap Memory ";
        String s4="JDBC";
        System.out.println(s2==s1);//
        System.out.println(s.equals(s2));//
        System.out.println(s2==s3);//
        System.out.println(s1==s3);//
    }
}
