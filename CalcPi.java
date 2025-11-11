// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
		double term = 0.0 ,PI = 0.0;

		double sign = 1.0 ;													// place is the dividing varible 1 1/3 1/5 ...... 

		// for loop that calculate the sum that is approximated to PI/4
		for ( int i = 0 ; i < numOfTerms ; i++ ){
			term = sign / ( 2 * i + 1 ) ;
			PI += term;
			sign *= -1;						
		}

		PI *= 4.0 ;									// varible that take the approximated sum of pi/4 and multiplie by 4 
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + PI);
	}
}
