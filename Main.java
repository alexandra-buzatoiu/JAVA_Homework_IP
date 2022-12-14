package ro.mta.ip.lab3JAVA.scthreads;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Student Dorobantu Gabriel ATM 22 4");
        Student s2 = new Student("Student Popa Ionel UPB 19 1");
        Profesor p1 = new Profesor("Profesor Deaconescu Razvan UPB 41 PSO");


        ArrayList<Human> list = new ArrayList<>();

        list.add(new Student("Student Dorobantu Gabriel ATM 22 4"));
        list.add(new Student("Student Popa Ionel UPB 19 1"));
        list.add(new Profesor("Profesor Deaconescu Razvan UPB 41 PSO"));


        //Natural order
        Collections.sort(list);

        for(int i=0;i<list.size(); i++)
        {
            System.out.println(list.get(i).toString());
        }

        /*System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(p1.toString());*/

    }
}
