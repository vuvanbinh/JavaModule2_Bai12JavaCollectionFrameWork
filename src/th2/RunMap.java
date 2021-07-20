package th2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RunMap {
    public static void main(String[] args) {
        Student student1 = new Student("Than",20,"Ha Noi");
        Student student2 = new Student("An ",21,"Ha Noi");
        Student student3 = new Student("LOL",22,"Ha Noi");

        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for (Map.Entry<Integer,Student> st: studentMap.entrySet()
             ) {
            Integer key = st.getKey();
            String value = st.toString();
            System.out.println( " Key : " + key+ " , Value : " + value);
        }
        System.out.println("================");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student s:students
             ) {
            System.out.println(s.toString());
        }


    }

}
