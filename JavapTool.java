

public class JavapTool {

    public String name;
    protected double salary;
    private int id;

    public static void main(String[] args) {
        System.out.println("javap JavapTool");
        JavapTool jt = new JavapTool();
        /*javap classname
            Display public/protected members of the class.
            javap JavapTool
            Compiled from "JavapTool.java"
            public class JavapTool {
            public java.lang.String name;
            protected double salary;
            public JavapTool();
            public static void main(java.lang.String[]);
        } */

        /* */



    }

    
}
