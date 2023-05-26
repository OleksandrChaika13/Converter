package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My amazing app for convertation from miles to kms and vice versa.");
        double miles = 15;
        double kmsRes = convertMilesToKms(miles);
        System.out.println(kmsRes + " kms in " + miles + " miles.");
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }
}
