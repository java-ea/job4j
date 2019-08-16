package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int EuroToRuble(int value) {
        return value * 70;
    }

    public static int DollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        {
            int in = 140;
            int expected = 2;
            int out = rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 euro. Test result : " + passed);
        }
        {
            int in = 2;
            int expected = 140;
            int out = EuroToRuble(in);
            boolean passed = expected == out;
            System.out.println("2 Euro are 140 ruble. Test result : " + passed);
        }
        {

            int in = 120;
            int expected = 2;
            int out = rubleToDollar(in);
            boolean passed = expected == out;
            System.out.println("120 rubles are 2 dollars. Test result : " + passed);
        }
        {
            int in = 2;
            int expected = 120;
            int out = DollarToRuble(in);
            boolean passed = expected == out;
            System.out.println("2 dollars are 120 rubles. Test result : " + passed);

        }
    }
}
