package StringProgram;

public class Pro12 {
    public static void main(String[] args) {
        {
            String s1 = "Java";
            // String s2 = "Programming";
            String rev1 = " ";
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                rev1 = ch + rev1;
            }
            System.out.println(rev1);
        }

    }
}
