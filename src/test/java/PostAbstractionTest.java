import Currencies.*;
import org.junit.*;

public class PostAbstractionTest {
    public double initialValue;
    USDollar usDollar = new USDollar();
    Euro euro = new Euro();
    Pound pound = new Pound();
    Rupee rupee = new Rupee();
    AUDollar auDollar = new AUDollar();
    CANDollar canDollar = new CANDollar();
    SingDollar singDollar = new SingDollar();
    Franc franc = new Franc();
    Ringgit ringgit = new Ringgit();
    Yen yen = new Yen();
    Yuan yuan = new Yuan();


    @Before
    public void setup(){
        initialValue = 1.00;


    }

    @Test
    public void dollarToEuroTest(){
        double expected = 0.94;
        double actual = CurrencyExchange.convertCurrency(initialValue, usDollar, euro);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void euroToPoundTest(){
        double expected = 0.872;
        double actual = CurrencyExchange.convertCurrency(initialValue, euro, pound);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void poundToRupeeTest(){
        double expected = 83.317;
        double actual = CurrencyExchange.convertCurrency(initialValue, pound, rupee);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void rupeeToAUDollarTest(){
        double expected = 0.019;
        double actual = CurrencyExchange.convertCurrency(initialValue, rupee, auDollar);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void auDollarToCanDollarTest(){
        double expected = 0.977;
        double actual = CurrencyExchange.convertCurrency(initialValue, auDollar, canDollar);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void canDollarToSingDollarTest(){
        double expected = 1.083;
        double actual = CurrencyExchange.convertCurrency(initialValue, canDollar, singDollar);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void singDollarToFrancTest(){
        double expected = 0.706;
        double actual = CurrencyExchange.convertCurrency(initialValue, singDollar, franc);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void francToRinggitTest(){
        double expected = 4.425;
        double actual = CurrencyExchange.convertCurrency(initialValue, franc, ringgit);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void ringittToYenTest(){
        double expected = 25.914;
        double actual = CurrencyExchange.convertCurrency(initialValue, ringgit, yen);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void yenToYuanTest(){
        double expected = 0.059;
        double actual = CurrencyExchange.convertCurrency(initialValue, yen, yuan);
        Assert.assertEquals(actual, expected, 0.001);
    }


}
