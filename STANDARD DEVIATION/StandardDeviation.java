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
    
    public static double calculateMeanDeviation(int [] numbers){
    double mean = calculateMean(numbers);
    double squared = 0;
    double sum = 0;
    double variance = 0;
    double standardDeviation = 0;
    
    for(int number : numbers){
    double difference = number-mean;
    squared = difference * difference;
    sum += squared;
    variance = sum / numbers.length;
    standardDeviation = Math.sqrt(variance);  
    }
    return standardDeviation;
    }
}
