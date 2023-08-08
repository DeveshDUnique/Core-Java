public class switch_statements {
    public static void main (String[] args)
    {

        // int num = 2;

        // switch(num){

        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesday");
        //     break;
        //     case 3:
        //     System.out.println("Wednesday");
        //     break;
        //     case 4:
        //     System.out.println("Thursday");
        //     break;
        //     case 5:
        //     System.out.println("Friday");
        //     break;
        //     case 6:
        //     System.out.println("Saturday");
        //     break;
        //     case 7:
        //     System.out.println("Sunday");
        // }



        String day = "";
        String result = "";

        result = switch(day)
        {
            case "saturday","sunday" -> "6 a.m";  // returning the 6 a.m if case matches.
            case "monday" -> "8 a.m";   // returning the 8 a.m if case matches.
            default -> "7 a.m";     // returning the 7 a.m if case matches.
        };

        System.out.println(result);

    }
    
}
