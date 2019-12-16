package calc;

public class CalculationsRomanNumbers {
    public String romanMode(String inputFirstNumber, String inputSecondNumber, String inputSign){
        
        String [] arrayNumbers = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        
        int firstNumber = (java.util.Arrays.asList(arrayNumbers).indexOf(inputFirstNumber))+1;
        int secondNumber = (java.util.Arrays.asList(arrayNumbers).indexOf(inputSecondNumber))+1;
        int result = 0;
        
        switch (inputSign) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        
        RomanToArabicConverter rac = new RomanToArabicConverter();
        return rac.intToRoman(result);
    }
}
