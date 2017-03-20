package hu.helixlab.feladat;

public class Main {

    public static void main(String[] args) {

        // Négyzet területe, kerülete //
        int a = 3;
        int b = 5;

        System.out.println("A téglalap terület: " + (a * b) + "cm2");
        System.out.println("A téglalap kerület: " + (2*a + 2*b) + "cm");

        // Deciliter átváltás //
        float dl = 10.0F;

        System.out.println("10dl = " + (dl * 100) + "ml");
        System.out.println("10dl = " + (dl * 10) + "cl");
        System.out.println("10dl = " + (dl / 10) + "l");
        System.out.println("10dl = " + (dl / 10000) + "hl");

        // Gömb térfogata //
        float r = 3.0F;

        System.out.println("A 3 sugarú gömb térfogata: " + (4 * Math.pow(r,3) * Math.PI / 3));

        // Celsius - Fahrenheitbe  történő váltását //

        System.out.println("10celsius = " + ((10/5)*9+32) + "fahrenheit" );
        System.out.println("70fahrenheit = " + ((70-32)/9*5) + "celsius");

        // Hello World //

        System.out.println("*Hello World in a frame* ");

    }
}
