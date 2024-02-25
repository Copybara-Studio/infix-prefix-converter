package my.converter;

import my.converter.controller.Converter;

public class Main {
    public static void main(String[] args) {
        String infix = "NOT (A AND B) OR (NOT C AND D)";
        Converter converter = new Converter(infix);
        System.out.println(converter.getInfix());
        converter.transform();
        System.out.println(converter.getPrefix());
        System.out.println("-----------------");

        String infix2 = "A AND B OR C AND D";
        Converter converter2 = new Converter(infix2);
        System.out.println(converter2.getInfix());
        converter2.transform();
        System.out.println(converter2.getPrefix());
        System.out.println("-----------------");

        String infix3 = "a and b or c and d or e and f";
        Converter converter3 = new Converter(infix3);
        System.out.println(converter3.getInfix());
        converter3.transform();
        System.out.println(converter3.getPrefix());
        System.out.println("-----------------");
    }
}