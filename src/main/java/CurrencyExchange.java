public class CurrencyExchange {
    private static final double USDOLLAR = 1.00;
    private static final double EURO = 0.94;
    private static final double POUND = 0.82;
    private static final double RUPEE = 68.32;
    private static final double AUDOLLAR = 1.35;
    private static final double CANDOLLAR = 1.32;
    private static final double SINGDOLLAR = 1.43;
    private static final double FRANC = 1.01;
    private static final double RINGGIT = 4.47;
    private static final double YEN = 115.84;
    private static final double YUAN = 6.92;

    public static double dollarToEuro(double initial){
        System.out.println(initial * EURO);
        return initial * EURO;
    }

    public static double euroToDollar(double initial){
        return initial / EURO;
    }

    public static double euroToPound(double initial){
        return euroToDollar(initial) * POUND;
    }

    public static double poundToRupee(double initial){
        return (initial/POUND) * RUPEE;
    }

    public static double rupeeToCanDollar(double initial){
        return (initial/RUPEE) * CANDOLLAR;
    }

}
