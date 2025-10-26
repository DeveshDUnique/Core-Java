package Design_Patterns.StructuralPatterns.AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("Dev", "Patil", "dev@gmail.com");

        SchoolStudent schoolStudent = new SchoolStudent("shiv", "patil", "shiv@gmail.com");

        students.add(collegeStudent);
        students.add(new Adapter(schoolStudent));

        return students;
    }

}
