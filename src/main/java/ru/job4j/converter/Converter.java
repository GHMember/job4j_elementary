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
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro or " + dollars + " dollars");

        float inConvertRublesToEuro = 140;
        float expectedConvertRublesToEuro = 2.0f;
        float outConvertRublesToEuro = Converter.rubleToEuro(inConvertRublesToEuro);
        boolean passedConvertRublesToEuro = expectedConvertRublesToEuro == outConvertRublesToEuro;
        System.out.println("140 rubles are 2.0 euro. Test result : " + passedConvertRublesToEuro);

        float inConvertRublesToDollars = 140;
        float expectedConvertRublesToDollars = 2.3333333f;
        float outConvertRublesToDollars = Converter.rubleToDollar(inConvertRublesToDollars);
        boolean passedConvertRublesToDollars = expectedConvertRublesToDollars == outConvertRublesToDollars;
        System.out.println("140 rubles are 2.3333333 dollars. Test result : " + passedConvertRublesToDollars);
    }

}
