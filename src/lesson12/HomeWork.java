package lesson12;

import lesson11.Student;

public class HomeWork {
}

class StudentTest {

    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students are equals.");
        } else {
            System.out.println("Students are not equals.");
        }
    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Student names, courses and grades are equals.");
                } else {
                    System.out.println("Student names and courses are equals, but grades are different.");
                }
            } else {
                System.out.println("The names of the students are equals, but the courses are different.");
            }
        } else {
            System.out.println("The names of the students are different.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 2, 5.5);
        Student s2 = new Student("Ivan", 2, 6.5);
        method1(s1, s2);
        method2(s1, s2);
        int a = 3;
        float f = 1;

    }
}