package Collections;

import java.util.*;

public class QueueMain {

    public static void main(String[] args) {
        StudentQueue s1 = new StudentQueue();
        StudentQueue s2 = new StudentQueue();
        StudentQueue s3 = new StudentQueue();

        s1.setId(9);
        s1.setName("Katy");
        s1.setSurname("Perry");
        s1.setCourse("Music");

        s2.setId(6);
        s2.setName("Taylor");
        s2.setSurname("Swift");
        s2.setCourse("Drama");

        s3.setId(7);
        s3.setName("Alicia");
        s3.setSurname("Pink");
        s3.setCourse("Music");
        
        PriorityQueue<StudentQueue> list = new PriorityQueue<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        int count = 1;
        while(!list.isEmpty()){
            System.out.println(count + "" + list.remove());
            count++;
        }
    }
}
