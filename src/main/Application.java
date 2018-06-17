package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        Student studentA = new Student("Andrew Kostenko", new Knowledge(5));
        university.addStudent(studentA);
        
        Student studentB = new Student("Julia Veselkina", new Knowledge(10));
        university.addStudent(studentB);
        
        Student studentC = new Student("Maria Perechrest", new Knowledge(15));
        university.addStudent(studentC);

        Internship internship = new Internship("Interlink");
        internship.setStudent(studentA);
        internship.setStudent(studentB);
        internship.setStudent(studentC);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
