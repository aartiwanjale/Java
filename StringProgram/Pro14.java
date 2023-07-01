package StringProgram;

public class Pro14 {
    public static void main(String[] args) {

//        rev("Aarti");}
Pro14 p=new Pro14();
p.rev("Aarti");}

        static void rev (String str){
            String str1 = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                str1 = ch + str1;
            }
            System.out.println(str1);
        }

    }


