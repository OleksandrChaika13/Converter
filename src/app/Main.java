package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("I really don't know what this app is about");
        double miles = 15;
        double kms = 26;
        double kmsRes = convertMilesToKms(miles);
        System.out.println(kmsRes + " kms in " + miles + " miles.");
        double milesRes = convertKmsToMiles(kms);
        System.out.println(milesRes + " miles in " + kms + " kms.");
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }

    private static double convertKmsToMiles(double kms) {
        return kms / 1.60934;
    }
}
