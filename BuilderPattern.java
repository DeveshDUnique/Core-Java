public class BuilderPattern {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phoneNumber;

    // Private constructor to enforce use of the builder
    private BuilderPattern(PersonBuilder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;

    }

    @Override
    public String toString() 
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
        }

        //static builder inner class
        public static class PersonBuilder
        {
            private  String firstName;
            private  String lastName;
            private  int age;
            private  String address;
            private  String phoneNumber;
        

        public PersonBuilder setFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;

        }
        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // Build method to construct the Person object
        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }


    public static void main(String[] args) 
    {
        // Create a Person object using the builder
        BuilderPattern person = new BuilderPattern.PersonBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setAddress("123 Main St")
                .setPhoneNumber("555-1234")
                .build();

        System.out.println(person);
    }
}
