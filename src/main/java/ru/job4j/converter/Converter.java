package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float input = 120;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float output = Converter.rubleToDollar(input);
        boolean passed = expected == out;
        boolean passed1 = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. Test result : " + passed1);
    }
}
