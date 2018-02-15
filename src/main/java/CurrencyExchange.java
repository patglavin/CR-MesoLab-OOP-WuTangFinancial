import Currencies.Currency;

public class CurrencyExchange {

    public static final double USDOLLAR = 1.00;
    public static final double EURO = 0.94;
    public static final double POUND = 0.82;
    public static final double RUPEE = 68.32;
    public static final double AUDOLLAR = 1.35;
    public static final double CANDOLLAR = 1.32;
    public static final double SINGDOLLAR = 1.43;
    public static final double FRANC = 1.01;
    public static final double RINGGIT = 4.47;
    public static final double YEN = 115.84;
    public static final double YUAN = 6.92;

    public static double convertCurrency(double initial, double startingCurrency, double endingCurrency){
        return (initial/startingCurrency) * endingCurrency;
    }

    public static double convertCurrency(double initial, Currency startingCurrency, Currency endingCurrency){
        return (initial/startingCurrency.getExchangeValue()) * endingCurrency.getExchangeValue();
    }

}
