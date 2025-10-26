package Design_Patterns.StructuralPatterns.AdapterPattern;

public class Adapter implements Student{

    private SchoolStudent schoolStudent;

    public Adapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }
    /*Your client code expects the Student interface, not SchoolStudent in the list being added.
     * use this
     */

    @Override
    public String getName() {
        return this.schoolStudent.getFirstName(); 
    }

    @Override
    public String getSurname() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmail();
    }

    
}