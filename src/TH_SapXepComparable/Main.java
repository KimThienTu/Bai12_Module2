package TH_SapXepComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Sơn",25,"ND");
        Student student1 = new Student("Vương",18,"PT");
        Student student2 = new Student("Quân",22,"HP");
        Student student3 = new Student("Sỹ",27,"HN");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list);
        for (Student st : list){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student st : list){
            System.out.println(st.toString());
        }
    }
}
