package TH3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getTuoi()>o2.getTuoi()){
            return 1;
        }else if(o1.getTuoi() == o2.getTuoi()){
            return 0;
        }else return -1;
    }
}
