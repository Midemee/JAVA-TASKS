public class MoreNumbers{
    public static void main(String[] args){

    for(int hundred = 0; hundred <= 9; hundred++) {
        for (int tens = 0; tens <= 9 ; tens++) {
           for( int units = 0; units <= 9; units++) {
                System.out.println(" " + hundred+tens+units);
            }
        }

    }


    }
}


//  System.out.printf("%3d%n", number);
