package Design_Patterns.CreationalPatterns.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("LLD");
        Course lldCourse = CourseFactory.getCourse("HLD");
        /*🔁 What Happens When You Run CourseFactory.getCourse("LLD")?
        new LLD() is called.LLD inherits from Course, so:First, Course() constructor runs.
        Inside it, this.createCourse() is called.Since this is really an LLD object, LLD.createCourse() is called.
        The LLD-specific modules are added to the modules list. */

        System.out.println("Course Selected = "+hldCourse);
        System.out.println("Course Selected = "+lldCourse);

    }
}
