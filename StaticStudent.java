public class StaticStudent {
    
        String name;
        String stream;
        int id;
        static String collegeName;
    
        public StaticStudent(String name, String stream, int id, String collegeName) {
            this.name = name;
            this.stream = stream;
            this.id = id;
            StaticStudent.collegeName = collegeName;  // Setting the same static member
        }

        static
        {
            collegeName = "Rao";
            System.out.println("Changed college name in static block");
        }

        // @Override
        // public String toString()
        // {
        //     return "name = "+name + " stream "+ stream + " id "+id + " college "+collegeName;
        // }
    
        public void printDetails() {
            System.out.println(name + " - " + stream + " - " + id + " - College: " + collegeName);
        }
    
        public static void main(String[] args) {
            StaticStudent s1 = new StaticStudent("John", "CS", 1, "College A");
            StaticStudent s2 = new StaticStudent("Jane", "IT", 2, "College B");
            StaticStudent s3 = new StaticStudent("Doe", "ECE", 3, "College C");
    
           s1.printDetails();
           s2.printDetails();
           s3.printDetails();
        }
    }
    
    

