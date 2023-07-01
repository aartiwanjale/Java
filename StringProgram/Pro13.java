package StringProgram;


public class Pro13 {
    void rev(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str1 = ch + str1;
        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
        Pro13 p = new Pro13();
        p.rev("Java");


    }
}

