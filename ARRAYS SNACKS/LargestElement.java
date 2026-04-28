public class LargestElement{
    public static int numbers(int[] number){
        int largest = number[0];

    for (int count = 0; count < number.length; count++){
        if (number[count] > largest){
            largest = number[count];
        }

    }

        return largest;
    }

    public static void main(String[] args) {
        int[] largest = {4, 20,5,8,1,9};
    System.out.println(numbers(largest));

    }

}
