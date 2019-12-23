package calc;
import java.io.IOException;

public class EssentialChecks {
    public boolean isNotEmpty (String s1) throws IOException {
        if (!s1.isEmpty() && !s1.isBlank()){
            return true;
        } else {
            throw new IOException("Input should not be empty!");
        }
    }
    public boolean areArabic (int number) {
        if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || 
                number == 6 || number == 7 || number == 8 || number == 9 || number == 10) {
            return true;
        } else {
            return false;
        }
    }
    public boolean areRoman (String number) {
        if (number.equals("I") || number.equals("II") || number.equals("III") || number.equals("IV") || number.equals("V") 
                || number.equals("VI") || number.equals("VII") || number.equals("VIII") || number.equals("IX") || number.equals("X")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean numbersAreValid(String number1, String number2) throws IOException {
        if (areRoman(number1)) {
            if (areRoman(number2)) {
                return true;
            } else {
                throw new IOException("Both numbers should be roman or arabic but not both at the same time!");
            }
        } else if (areArabic(convertStringToInt(number1))) {
            if (areArabic(convertStringToInt(number2))) {
                return true;
            } else {
                throw new IOException("Both numbers should be roman or arabic but not both at the same time ranging from 1 to 10 or from I to X!");
            }
        } else {
            throw new IOException("Both numbers should be roman or arabic but not both at the same time ranging from 1 to 10 or from I to X!");
        }
    }
    
    public int convertStringToInt(String string) {
        int number = 0;
        try {
            number = Integer.parseInt(string);
        }
        catch (NumberFormatException e) {
            //no need to catch anything here, we are sure that input is valid at this point
        }
        return number;
    }
}
