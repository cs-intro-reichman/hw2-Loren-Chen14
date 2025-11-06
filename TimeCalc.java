public class TimeCalc {
    public static void main(String[] args) {
        // dividing the time input to hours and minutes
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1 ));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutesToAdd = Integer.parseInt(args[1]);
        String Smin , Shour;

        int totalMinutes = ( hours * 60 ) + minutes + minutesToAdd ;
        int totalHours = totalMinutes / 60 ; 
        int newHours = totalHours % 24 ; 
        int newMinutes = totalMinutes - ( totalHours * 60 );

        Shour = "" + newHours ;
        Smin = "" + newMinutes ;

        if ( newMinutes < 10 ){
            Smin = "0" + newMinutes ; 
        }
        if ( newHours < 10 ){
            Shour = "0" + newHours ;
        }

        System.out.println( Shour + ":" + Smin);
    }
}
