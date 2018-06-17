package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
    
    String name;
    Knowledge knowledge;
    University university;
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }
    
    public String getName() {
        return name;
    }
    
    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
    
    public University getUniversity() {
        return university;
    }
    
    public void setUniversity(University university) {
        this.university = university;
    }
}
