package List;

import java.util.ArrayList;
import java.util.List;

public class Pro1 {
    public static void main(String args[]){
        List list= new ArrayList();
        list.add(123);
        list.add("Java Program");

        List list1= new ArrayList();
        list1.add(123);
        list1.add("Java Program123");


//        System.out.println(list.add(4));//true or false  answer
//        System.out.println(list.get(2)); // index value 4
//        System.out.println(list.indexOf(123)); //Parameter index value return
//        System.out.println(list.equals(list1)); // two string compare
        System.out.println(list.size());
        System.out.println(list.remove(0));
        System.out.println(list.addAll(list1));
        int hashcode=1;
        System.out.println(list.hashCode());
      //  System.out.println(list.);

    }

}
