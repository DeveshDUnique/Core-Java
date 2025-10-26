package Lambda;

import java.util.function.BinaryOperator;

/*In capturing lambda expression result also depends on additional variables in the context of the
 lambda expression passed to it, then it is capturing
 In some functional languages, this is known as Closures. */
public class CapturingLambda {
    public static void calc(Double a, Double b, BinaryOperator<Double> op) {
		Double r = op.apply(a, b);
		
		System.out.println("Result: " + r);
	}
    public static void main(String[] args) {
        double x = 3.0, y = 4.0, z= 5.0;

        calc(x,y,(t,u)-> t+u+z);    
    }
    
}
