public class methods {
    public static void main (String args[])
    {

        demo dm = new demo();
        String str = dm.get_pen(3);
        System.out.println((str));

        dm.playmusic();



    }
    
}


class demo {

    public void playmusic()
    {
        System.out.println(("Music playing..."));
    }


    public String get_pen(int n)
    {
        if (n>=10)
        {
        System.out.println(("Another method of demo class"));
        return "pen";
        }
        else
        return "nothing";
    }
}


