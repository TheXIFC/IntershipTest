package institution;

import java.util.ArrayList;
import person.Student;

public class University {

    
    String name;
    ArrayList<Student> studentsList;
    
    double averageKnowledgeLevel;
    
    public University(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
        
    }

    public void addStudent(Student student) {
        studentsList.add(student);
        student.setUniversity(this);
        countAverageKnowledgeLevel();
    }
    
    private void countAverageKnowledgeLevel() {
        int counter = 0;
        for (Student student : studentsList)
            counter += student.getKnowledge().getLevel();
        averageKnowledgeLevel = (double) counter / studentsList.size();
    }
    
    public double getAverageKnowledgeLevel() {
        return averageKnowledgeLevel;
    }
}
