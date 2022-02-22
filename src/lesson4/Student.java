package lesson4;

public class Student {

    int studentTicket;
    String firstName;
    String lastName;
    int yearOfEducation;
    double mathGradeAvg;
    double economyGradeAvg;
    double foreignLanguageGradeAvg;

}

class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentTicket = 1;
        student1.firstName = "Alexandr";
        student1.lastName = "Leshik";
        student1.mathGradeAvg = 9.3;
        student1.economyGradeAvg = 9;
        student1.foreignLanguageGradeAvg = 9.1;

        double student1AverageGrade = (student1.mathGradeAvg + student1.economyGradeAvg + student1.foreignLanguageGradeAvg) / 3;
        System.out.println("Student 1 average grade: " + student1AverageGrade);

        student2.studentTicket = 2;
        student2.firstName = "Ivan";
        student2.lastName = "Ivanov";
        student2.yearOfEducation = 3;
        student2.mathGradeAvg = 8.7;
        student2.economyGradeAvg = 9.2;
        student2.foreignLanguageGradeAvg = 9.6;

        double student2AverageGrade = (student2.mathGradeAvg + student2.economyGradeAvg + student2.foreignLanguageGradeAvg) / 3;
        System.out.println("Student 2 average grade: " + student2AverageGrade);

        student3.studentTicket = 3;
        student3.firstName = "Petr";
        student3.lastName = "Petrov";
        student3.yearOfEducation = 4;
        student3.mathGradeAvg = 8.5;
        student3.economyGradeAvg = 8.7;
        student3.foreignLanguageGradeAvg = 9;

        double student3AverageGrade = (student3.mathGradeAvg + student3.economyGradeAvg + student3.foreignLanguageGradeAvg) / 3;
        System.out.println("Student 3 average grade: " + student3AverageGrade);
    }

}
