package app;

public class Main {
    public static  final double MILES_TO_KILOMETERS_COEFFICIENT=1.60934;
    public static final double KILOMETERS_TO_MILES_COEFFICIENT = 0.621371;
    public static void main(String[] args){
        System.out.println("Distance Units Converter app.");
        double mls=5.0;
        double klm=10.0;
        double kilometers=convMilesToKilometers(mls);
        double miles=convKilometersToMiles(klm);
        System.out.println("Result is "+kilometers+" kilometers and "+miles+" miles");
    }

    public static double convMilesToKilometers(double miles){
        return miles*MILES_TO_KILOMETERS_COEFFICIENT;
    }
    public static double convKilometersToMiles(double kilometers){
        return kilometers*KILOMETERS_TO_MILES_COEFFICIENT;
    }
}
