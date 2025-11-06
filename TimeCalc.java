public class TimeCalc {
    public static void main(String[] args) {
        // dividing the time input to hours and minutes
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1 ));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutesToAdd = Integer.parseInt(args[1]);
        String Smin , Shour;

        // calculating the new time 
        int totalMinutes = ( hours * 60 ) + minutes + minutesToAdd ;
        int totalHours = totalMinutes / 60 ; 
        int newHours = totalHours % 24 ; 
        int newMinutes = totalMinutes - ( totalHours * 60 );

        // creating new strings for hour and minutes
        Shour = "" + newHours ;
        Smin = "" + newMinutes ;

        // checking if there is a need to add 0 before minutes or hours if so changing 
        if ( newMinutes < 10 ){
            Smin = "0" + newMinutes ; 
        }
        if ( newHours < 10 ){
            Shour = "0" + newHours ;
        }

        // printing the new time 
        System.out.println( Shour + ":" + Smin);
    }
}
