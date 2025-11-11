// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]); 							// N the highest seed
		int seed; 
		String mode = args[1];

		// for loop for each line from 1 to N
		for (int i = 1 ; i <= N ; i++ ){
			seed = i;
			int counter = 1;										// counter of steps the series took to reach 1.
			String output = "";										// string where each seed will bw added

			// for the first line case when the first seed is 1
			if (seed == 1){
				output += seed + " ";
				seed = seed * 3 + 1;
				counter ++;
			}

			// starting to use the series rules until reaching 1 
			while (seed != 1) {
				if ( seed % 2 == 0 ){
					output += seed + " ";
					seed /= 2;
					counter++;
				} else {
					output += seed + " ";
					seed = seed * 3 + 1;
					counter++; }
			}
			output += seed + " ";									// adding the last seed which is 1

			if ( mode.equals("v")){						// cheking if verbose or concise
				System.out.println(output + "(" + counter + ")" );
			}

		}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}


