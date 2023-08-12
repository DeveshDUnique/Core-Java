class student
{
    String name;
    int rollno;
    int marks;
}



public class arrayobjects {
    public static void main(String[] args){


       

        student s1 = new student(); // s1 object of student class
        s1.name = "Dev";
        s1.rollno = 10;
        s1.marks = 86;

        student s2 = new student(); // s1 object of student class
        s2.name = "Shiv";
        s2.rollno = 110;
        s2.marks = 76;

        student s3 = new student(); // s1 object of student class
        s3.name = "lalu";
        s3.rollno = 56;
        s3.marks = 84;


        System.out.println(s2); //address of s1 object = student@7a81197d

        student std[] = new student[3]; // creating an array of class student
        std[0] = s1; // putting the object values in the array index created
        std[1] = s2;
        std[2] = s3;

        for(int i =0; i<std.length;i++)
        {
            System.out.println(std[i].name + " : " + std[i].marks);
        }

        

        ////enhanced for loop
        for(student n : std)
        {
            System.out.println((n.name));
        }


        //enhanced for loop

        int arr[] = new int[3]; // integer array of length 3
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;


        for(int n : arr)
        {
            System.out.println(n);
        }


    }
    
}
