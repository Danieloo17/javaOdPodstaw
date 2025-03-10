package exampless;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class floatingPointNumbers {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.5;
        double c = a / b;

        System.out.println(Math.round(c * 100) / 100.0);
        BigDecimal roundedNumber = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);
        System.out.println(roundedNumber.doubleValue());
        String formatted = String.format("%.2f", c);
        System.out.println(formatted);
        System.out.println(Math.floor(c));


    }
}
