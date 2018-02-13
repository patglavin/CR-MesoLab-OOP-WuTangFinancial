
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrencyExchangeTest {
    double initial;

    @Before
    public void setup(){
        initial = 1.00;
    }

    @Test
    public void testDollarToEuro(){
        double expected = 0.94;
        double actual = CurrencyExchange.dollarToEuro(initial);
        System.out.println(CurrencyExchange.dollarToEuro(initial));
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testEuroToDollar(){
        double expected = 1.063;
        double actual = CurrencyExchange.euroToDollar(initial);
        System.out.println(CurrencyExchange.euroToDollar(initial));
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testEuroToPound(){
        double expected = 0.872;
        double actual = CurrencyExchange.euroToPound(initial);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testPoundToRupee(){
        double expected = 83.317;
        double actual = CurrencyExchange.poundToRupee(initial);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testRupeeToCanDollar(){
        double expected = 0.019;
        double actual = CurrencyExchange.rupeeToCanDollar(initial);
        Assert.assertEquals(expected, actual, 0.001);
    }

}
