package Lambda;

import java.util.function.BinaryOperator;

/*If lambda expression result entirely depends on the arguments passed to it, then it is non-capturing (self-contained).
 * In functional programming, such functions/lambdas are referred as pure functions.
 */
public class NonCapturingLamba {
    public static void calc(Double a, Double b,BinaryOperator<Double>op)
    {
        Double r = op.apply(a, b);
        System.out.println("Result :"+ r);

    }
    
    public static void main(String[] args) {
        double x = 3.0, y = 4.0, z= 5.0;
        calc(x, y, (t,u) -> t+u);
        calc(z,y, (t,u) -> t+u);
    }
}
