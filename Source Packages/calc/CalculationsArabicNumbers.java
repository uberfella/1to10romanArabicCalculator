package calc;

public class CalculationsArabicNumbers {
    public int arabicMode(String inputFirstNumber, String inputSecondNumber, String inputSign){
        
        int firstNumberInt = Integer.parseInt(inputFirstNumber);
        int secondNumberInt = Integer.parseInt(inputSecondNumber);
        
        switch (inputSign) {
            case "+":
                return firstNumberInt + secondNumberInt;
            case "-":
                return firstNumberInt - secondNumberInt;
            case "*":
                return firstNumberInt * secondNumberInt;
            case "/":
                return firstNumberInt / secondNumberInt;
            default:
                return 1;
        }
    }
}
