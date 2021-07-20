package TH3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Dai",18,"QN");
        Student student2 = new Student("Than",19,"HN");
        Student student3 = new Student("Chung",16,"HD");
        Student student4 = new Student("Cuong",15,"HP");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for(Student st :lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println( " so sanh theo tuoi : ");
        for (Student st :lists
             ) {
            System.out.println(st.toString());
        }
    }
}
