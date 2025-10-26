package Design_Patterns.StructuralPatterns.AdapterPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> studentList = client.getStudentList();
        for (Student student : studentList) {
        System.out.println(student.getName() + " " + student.getSurname() + " - " + student.getEmail());
    }
    }
    
}
