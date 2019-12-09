package calc;
import java.io.IOException;

public class Calculations {
   
    public void calculations(String stringInput) throws IOException {
        EssentialChecks essentialChecks = new EssentialChecks();
        essentialChecks.isNotEmpty(stringInput);
        
        String [] inputArray = stringInput.split("\\s");
        String inputFirstNumber = inputArray[0];
        String inputSecondNumber = inputArray[2];
        String inputSign = inputArray[1];
        
        essentialChecks.numbersAreValid(inputFirstNumber, inputSecondNumber);
        
        if (essentialChecks.areRoman(inputFirstNumber) && essentialChecks.areRoman(inputSecondNumber)) {
            CalculationsRomanNumbers calculationsRomanNumbers = new CalculationsRomanNumbers();
            System.out.println(calculationsRomanNumbers.romanMode(inputFirstNumber, inputSecondNumber, inputSign));
        } else if (essentialChecks.areArabic(Integer.parseInt(inputFirstNumber)) && essentialChecks.areArabic(Integer.parseInt(inputSecondNumber))){
                CalculationsArabicNumbers calculationsArabicNumbers = new CalculationsArabicNumbers();
                System.out.println(calculationsArabicNumbers.arabicMode(inputFirstNumber, inputSecondNumber, inputSign));
        }
    }
}
