package Final;
public class Final 
{
    //final keyword can be used in following ways.
    // Final fields
    // Final variables
    // Final class
    // Final methods




    public static void main(String[] args) {
        final int var = 10;

        System.out.println(var);
      //  var = 20;  // final local variable cannot be changed


      final Final test = new Final();
		test.displayTest();

       // test = new Final();  //NOT OK  Since test is declared as final, you are not allowed to change the reference once it has been assigned.
    }

    private void displayTest() {
        // TODO Auto-generated method stub
    }
    
}
