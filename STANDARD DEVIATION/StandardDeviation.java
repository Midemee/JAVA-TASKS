public class StandardDeviation{
    public static double calculateMean(int[] numbers){
    double sum = 0;
    double mean = 0;
    for(int number : numbers){
        sum += number;
        mean = sum / numbers.length;
    }
     return mean;
    }

    
    public static double sumOfSquared(int[] numbers) {
        double mean = calculateMean(numbers);
        double sum = 0;

        for (int number : numbers) {
            double difference = number - mean;
            double squared = difference * difference;
            sum += squared;
        }
        return sum;
    }
    

    public static double calculateStandardDeviation(int[] numbers) {
        double sum = sumOfSquared(numbers);
        double variance = sum / numbers.length;
        double standardDeviation = Math.sqrt(variance);
        return standardDeviation;
    }
    
    /*    public static double calculateMeanDeviation(int [] numbers){
    double mean = calculateMean(numbers);
    double sum = 0;
    double standardDeviation = 0;
    
    for(int number : numbers){
    double difference = number-mean;
    double squared = difference * difference;
    sum += squared;
    double variance = sum / numbers.length;
    standardDeviation = Math.sqrt(variance);  
    }
    return standardDeviation;
    }*/

}

