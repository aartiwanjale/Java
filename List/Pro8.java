package List;

   // import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

     class Employee implements Comparable<Employee> {
         private String name;
         private int id;
         private String city;

         @Override
         public String toString() {
             return "User{" + "id=" + id + ", name='" + name + '\'' + ", city='" + city + '\'' + '}';
         }

         public Employee(int id, String name, String city) {
             this.id = id;
             this.name = name;
             this.city = city;
         }



        private static List<Employee> User;

        public static void main(String[] args) {
            List<Employee> list  = new ArrayList<>();
            list.add(new Employee(01,"Vijay","Nanded"));
            list.add(new Employee(02,"Sourabh","Latur"));
            list.add(new Employee(03,"Anghad","Nanded") );
            list.add(new Employee(04,"Shubham","Latur"));
            Collections.sort(list);
            for(Employee e:list)
            System.out.println(e);
        }

        @Override
        public int compareTo( Employee o) {
            return this.name.compareTo(o.name);
        }
    }

