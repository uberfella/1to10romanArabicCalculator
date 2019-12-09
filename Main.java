package calc;
import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //getting user input
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        
        Calculations calc = new Calculations();
        calc.calculations(stringInput);
    }
}
