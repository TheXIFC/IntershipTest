package institution.interlink;

import java.util.ArrayList;
import person.Student;

public class Internship {
    
    String name;
    ArrayList<Student> studentsList;
    
    public Internship(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public void setStudent(Student student) {
        if (student.getKnowledge().getLevel() > student.getUniversity().getAverageKnowledgeLevel())
            studentsList.add(student);
    }

    public String getStudents() {
        StringBuilder builder = new StringBuilder();
        for (Student student : studentsList) {
            builder.append(student.getName()).append("\n");
        }
        return builder.toString();
    }
}
