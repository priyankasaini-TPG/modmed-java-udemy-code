package section4;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.4554,3.456));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if((int)(num1 *1000) == (int)(num2 *1000))
            return true;
        else
            return false;
    }
}
