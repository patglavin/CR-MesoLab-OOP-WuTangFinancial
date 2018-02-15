import Currencies.*;
import org.junit.*;

public class PostAbstractionTest {
    public double initialValue;
    USDollar usDollar = new USDollar();
    Euro euro = new Euro();
    Pound pound = new Pound();
    Rupee rupee = new Rupee();


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


}
