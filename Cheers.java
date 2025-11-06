//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
            int num = Integer.parseInt(args[1]);

            String anBefore = "AEFHILMNORSX";           // all the letters which there should be an before

            cheer = cheer.toUpperCase();                // turning all the letters to capital letters

            for (int i =0 ; i < cheer.length() ; i++ ) {
                if ( anBefore.indexOf(cheer.charAt(i)) == -1) {
                        System.out.println("Give me a " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!" );
                } else {
                        System.out.println("Give me an " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!" );  
                }
            }

            System.out.println("What does that spell?");

            for (int j=0 ; j < num ; j++ ){
                System.out.println(cheer + "!!!");
            }

        }
}
