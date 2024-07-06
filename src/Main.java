import interface_package.TaxCalculator;
import interface_package.TaxCalculator2019;
import interface_package.TaxCalculator2020;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        User user1 = new User("Shehanuk");
        user1.name = "Shehanuk - edited";
        System.out.println(user1.name);

        TaxCalculator taxCalculator = getCalculator(); // type is like interface
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
//        return new TaxCalculator2020();
    }
}