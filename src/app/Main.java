package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        double miles = 15;
        double kmsRes = convertMilesToKms(miles);
        System.out.println(kmsRes + " kms in " + miles + " miles.");
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }
}
