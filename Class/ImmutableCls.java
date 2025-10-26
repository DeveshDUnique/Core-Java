package Class;
/*Key Points to Remember:

Final class and fields - Prevents inheritance and field modification.
No mutator methods - Only provide getters, no setters.
Defensive copying - Always create copies when dealing with mutable objects.
Proper equals/hashCode - Essential for collections and comparisons.
Thread safety - Immutable objects are inherently thread-safe.
Performance consideration - Defensive copying has overhead, consider using immutable collections. */

import java.util.*;

public final class ImmutableCls {
    private final String name;
    private final int age;
    private final List<String> hobbies;
    private final Date birthDate;
    
    // Constructor with defensive copying
    public ImmutableCls(String name, int age, List<String> hobbies, Date birthDate) {
        this.name = name;
        this.age = age;
        // Defensive copy of mutable objects
        this.hobbies = hobbies != null ? new ArrayList<>(hobbies) : new ArrayList<>();
        this.birthDate = birthDate != null ? new Date(birthDate.getTime()) : null;
    }
    
    // Only getter methods, no setters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Return defensive copy of mutable objects
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
    
    public Date getBirthDate() {
        return birthDate != null ? new Date(birthDate.getTime()) : null;
    }
    
    // Override equals and hashCode for proper behavior.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        ImmutableCls that = (ImmutableCls) obj;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(hobbies, that.hobbies) && Objects.equals(birthDate, that.birthDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age, hobbies, birthDate);
    }
    
    @Override
    public String toString() {
        return "ImmutablePerson{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", hobbies=" + hobbies +
               ", birthDate=" + birthDate +
               '}';
    }

    public static void main(String[] args) {

        //create a immutable object
        List<String> hobbies = Arrays.asList("Reading","Swimming");
        ImmutableCls cls = new ImmutableCls("Shiv", 22, hobbies, new Date());

        //another list of hobbies
        List<String> retrievedHobbies = cls.getHobbies();
        retrievedHobbies.add("pubg");  // it wont change the original list

        System.out.println("Original first hobbies list = " + hobbies);

        System.out.println("Another new list created "+ retrievedHobbies);
        
    }

}