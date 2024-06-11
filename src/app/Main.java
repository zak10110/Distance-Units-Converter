package app;

public class Main {
    public static  final double MILES_TO_KILOMETERS_COEFFICIENT=1.60934;
    public static void main(String[] args){
        System.out.println("Distance Units Converter app.");
        double mls=5.0;
        double kilometers=convMilesToKilometers(mls);
        System.out.println("Result is "+kilometers+" kilometers");
    }

    public static double convMilesToKilometers(double miles){
        return miles*MILES_TO_KILOMETERS_COEFFICIENT;
    }
}
