package List;

import java.util.*;
import java.lang.*;

// A class to represent a student.
    class Student1
    {
        int id;
        String name;

        // Constructor
        public Student1(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        // Used to print student details in main()
        public String toString()
        {
            return this.id + " " + this.name ;
        }
    }

    class Sortbyroll implements Comparator<Student1>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Student1 a, Student1 b)
        {
            return a.id - b.id;
        }
    }

    // Driver class
    class Main
    {
        public static void main (String[] args)
        {
            ArrayList<Student1> ar = new ArrayList<Student1>();
            ar.add(new Student1(111, "bbbb"));
            ar.add(new Student1(131, "aaaa"));
            ar.add(new Student1(121, "cccc"));

            System.out.println("Unsorted");
            for (int i=0; i<ar.size(); i++)
                System.out.println(ar.get(i));

            Collections.sort(ar, new Sortbyroll());

            System.out.println("\nSorted by rollno");
            for (int i=0; i<ar.size(); i++)
                System.out.println(ar.get(i));
        }
    }


