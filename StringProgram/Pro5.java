package StringProgram;

public class Pro5 {
    public static void main(String[] args) {
        String s = new String("JDBC");
        String s2 = new String("Java");
        String s3 = "Java Programming ";
        String s1 = "Heap Memory ";
        String s4 = "JDBC";
        s = s.concat("JAVA is programming Language ");
        System.out.println(s2 == s3);//false
        System.out.println(s.equals(s1));//false
        System.out.println(s2 == s3);//false
        System.out.println(s4 == s3);//false
        System.out.println(s);
    }
}
