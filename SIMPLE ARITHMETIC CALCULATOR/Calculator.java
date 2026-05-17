public class Calculator{
    static int number1;
    static int number2;

    public static int arithmeticCalculator(String operator){
    int result = 0;
    if (operator == "*"){
    result = multiplication(number1, number2);
    }
    if (operator == "-"){
    result = subtraction(number1, number2);
    }
    if (operator == "+"){
    result = addition(number1, number2);
    }
    if (operator == "/"){
    result = division(number1, number2);
    }
    return result;
    }
    
    public static int multiplication(int number1, int number2){
    return number1 * number2;
    }
    
    public static int subtraction(int number1, int number2){
    return number1 - number2;
    }
    
    public static int addition(int number1, int number2){
    return number1 + number2;
    }
    
    public static int division(int number1, int number2){
    if (number2 == 0){
    throw new ArithmeticException("Cannot divide by zero");    
    }
    return number1 / number2;
    }

}
