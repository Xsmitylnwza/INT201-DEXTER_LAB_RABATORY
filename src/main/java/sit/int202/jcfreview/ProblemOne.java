package sit.int202.jcfreview;

import java.util.*;

public class ProblemOne {
    public static void main(String[] args) {
        Student s1 = new Student(10001,"Somchai",3.50);
        Student s2 = new Student(10001,"Somchai",3.10);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        //when we have 100 students
        //Set<Student> studentSet = new HashSet<>(125,0.75);
        Set<Student> studentSet = new HashSet<>(200,0.5f);
        studentSet.add(new Student(10001,"Somsri",3.25));
//        studentSet.add(new Student(10001,"Somsri",3.25));
//        studentSet.add(new Student(10001,"Somsri",3.25));
        studentSet.add(new Student(10002,"Somsak",3.0));
        studentSet.add(new Student(10009,"Somchai",3.26));
        studentSet.add(new Student(10007,"Somsiri",3.25));
        studentSet.add(new Student(10037,"Sirisopaphan",3.25));
        for (Student s:studentSet) {
            System.out.println(s +" --> "+ s.hashCode());
        }
        System.out.println("=================================");

        Set<Student> studentSet2 = new TreeSet<>();
        studentSet2.add(new Student(10001,"Somsri",3.25));
        studentSet2.add(new Student(10002,"Somsak",3.0));
        studentSet2.add(new Student(10009,"Somchai",3.26));
        studentSet2.add(new Student(10007,"Somsiri",3.25));
        studentSet2.add(new Student(10037,"Sirisopaphan",3.25));
        for (Student s3:studentSet2) {
            System.out.println(s3 +" -> " + s3.hashCode());
        }
        // class comparator
      // List<Student> tmp = studentSet.stream().sorted(new StudentComparatorByGpax()).toList();
        // inner class annonymous
        List<Student> tmp = studentSet.stream().sorted(Student.COMPARE_BY_GPAX).toList();
        System.out.println("------");
        for (Student s:tmp) {
            System.out.println(s+ " -> "+ s.hashCode());
        }
    }
}
