public class InnerClass
{
    public static void main(String a[])
    {
        a obj = new a();
        obj.show();

        a.b obj1 = obj.new b(); // creating object of inner class b which is non- static
        obj1.config();

        a.c obj2 = new a.c();
        obj2.stats();


    
    }    
}

class a
{
    int age;

    public void show()
    {
        System.out.println("In show");
    }


    class b
    {
        public void config()
        {
            System.out.println("In inner class");
        }
    }

    static class c
    {
        public void stats()
        {
            System.out.println("In static class");
        }
    }

}



