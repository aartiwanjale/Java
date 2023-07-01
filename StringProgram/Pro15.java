package StringProgram;

public class Pro15 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";
        String rev1 = " ";
        String rev2 = " ";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            rev1 = ch + rev1;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            rev2 = ch + rev2;

        }
        System.out.print(rev1+rev2);
        //System.out.print(rev2);
    }
}

