package Design_Patterns.StructuralPatterns.AdapterPattern;

public class SchoolStudent {

    private String firstName;
    private String lastname;
    private String emailAddress;

    public SchoolStudent(String firstName,String lastname,String emailAddress){
        this.firstName = firstName;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
    }
    
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastname;
    }

    public String getEmail(){
        return emailAddress;
    }
}
