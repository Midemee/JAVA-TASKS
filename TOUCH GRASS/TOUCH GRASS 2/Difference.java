public class Difference{
    public static int subtract(int numberOne, int numberTwo){
        if(numberOne > numberTwo){
            return numberOne - numberTwo;
        }
        else{
            return numberTwo - numberOne;
        }

    }

    public static void main(String[] args){
        System.out.println(subtract(15,30));
        System.out.println(subtract(30,15));
    }

}
