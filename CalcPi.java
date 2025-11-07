// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
		double negative = 0 , positive = 0 , PI = 0;

		double place = 1 ;													// place is the dividing varible 1 1/3 1/5 ...... 

		// for loop that calculate the sum that is approximated to PI/4
		for ( int i = 1 ; i <= numOfTerms ; i++ ){
			if ( i % 2 == 0 ){
				negative -= 1 / place ; 
			} else {
				positive += 1 / place ;
			}
			place += 2 ;						
		}

		PI = 4 * ( positive + negative );									// new pi varible that take the approximated sum of pi/4 and multiplie by 4 
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated:     " + PI);
	}
}
