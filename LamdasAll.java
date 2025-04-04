//Non-capturing lambda expression If lambda expression result entirely depends on the arguments passed to it.

//Capturing lambda expression
//If lambda expression result also depends on additional variables in the context of the lambda expression passed to it,

import java.util.function.BinaryOperator;

public class LamdasAll 
{
    public static void calc(double a,double b,BinaryOperator<Double>op)
    {
        Double r = op.apply(a, b);
        System.out.println("Result = "+r);
    } 
    public static void main(String[] args) 
    {
        double x = 2.1, y = 4.3, z = 1.5;
        calc(x, y,(t,u) -> x + y);// non-capturing lamda where result entirely depends on the arguments passes(Pure functions).
        calc(x, y,  (t,u) -> x + y + z); // capturing lambda where result depends on additional variables in lambda expressions(Closures).

    }
}
