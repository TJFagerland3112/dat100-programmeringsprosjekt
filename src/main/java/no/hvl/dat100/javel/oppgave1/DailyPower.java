package no.hvl.dat100.javel.oppgave1;
import java.util.Scanner;
public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (int i  = 0; i < prices.length; i++) {
            System.out.printf("%.2f NOK ", prices[i]);
        }

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (int i  = 0; i < usage.length; i++) {
            System.out.printf("%.2f kWh ", usage[i]);
        }

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (int i  = 0; i < usage.length; i++) {
            sum += usage[i];
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
        double timeUsage = 0;
        double timePrice = 0;

        for (int i  = 0; i < usage.length; i++) {
            for (int j  = 0; j < prices.length; j++) {
                timeUsage = usage[i];
                timePrice = prices[j];
                price += timeUsage * timePrice;
            }
        }


        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    static double getSupport(double usage, double price) {
        /*System.out.print("hvilken time vil du vite strømstøtte på? ");
        Scanner in  = new Scanner(System.in);
        int time = in.nextInt();
        System.out.println(" ");
        double support = 0;

        double timeUsage = 0 ;
        timeUsage = usage[time];
        double timePrice = 0;
        timePrice = price[time];
        double timePris = timeUsage * timePrice;

        if (timeUsage > THRESHOLD) {
            support = (timePris - THRESHOLD) * PERCENTAGE;
        } else support = 0;

        return support; */ //ikke ferdig.
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        // TODO

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        // TODO

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        // TODO

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;

        // TODO

        return average;
    }
}