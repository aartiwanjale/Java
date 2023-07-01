package StringProgram;

import java.security.Key;
import java.util.jar.JarEntry;

public class AllMethods {
    public static void main(String[] args) {
        String s="Java Program   ";
        String s3 = null;

        String s1="Most Popular Programming Language      ";
        System.out.println("String Length:" +s.length());

        System.out.println("Specific Position:"+s.charAt(5));

        System.out.println("String Substring:"+s.substring(3));// Start the index 3

        System.out.println("String Substring Start & end Point:"+s.substring(2,7));

        System.out.println("Two String is connected : "+s.concat(s1));

        System.out.println("String Specific:"+s.indexOf("Popular"));

        System.out.println("String Specific:"+s.indexOf("Popular",3));

        System.out.println("String Last:"+s.lastIndexOf(6));

        System.out.println("Char Replace:"+s.replace("J", "k"));

        System.out.println("Returns the copy of the String trim:"+s1.trim());

        System.out.println("Uppercase:"+s.toUpperCase());

        System.out.println("Lowercase:"+s.toLowerCase());

        String str3="GeeksforGeeks";
        System.out.println(str3.substring(0,13));

        String str4="JavaProgram";
        System.out.println(str4.substring(3));
        System.out.println(str4.replace("a","r"));
    }
}


