
import java.util.HashMap;

public class NewClass {
    
    private static int[] base_numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static HashMap<Integer, String> map = new HashMap<Integer, String>();

    private static void setup() {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
    }

    public String intToRoman(int num) {
        setup();
        String result = new String();
        for (int i : base_numbers) {
            while (num >= i) {
                result += map.get(i);
                num -= i;
            }
        }
        return result;
    }
}
