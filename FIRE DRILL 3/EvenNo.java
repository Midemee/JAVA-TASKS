import java.util.Arrays;

public class EvenNo{
    public static int[] number(int[] list){
        int[] even = new int [list.length];


        for (int index = 0; index < list.length; index++){
            if (list[index] % 2 == 0) {
                even[count] = list[index];

            }
        }

        int[] evenArray = new int[count];

        int counter = 0;
        for(int number: even) {
            if(counter < evenArray.length) {
                evenArray[counter] = number;
                counter++;
            } else {
                break;
            }
        }

        return evenArray;
    }

    public static void main(String[] args) {
        
        int[] list = {2, 7, 6, 9, 10,3};

        System.out.println(Arrays.toString(number(list)));
    }
}

