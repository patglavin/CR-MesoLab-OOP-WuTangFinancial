
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
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.USDOLLAR, CurrencyExchange.EURO);
        System.out.println(CurrencyExchange.convertCurrency(initial, CurrencyExchange.USDOLLAR, CurrencyExchange.EURO));
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testEuroToDollar(){
        double expected = 1.063;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.EURO, CurrencyExchange.USDOLLAR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testEuroToPound(){
        double expected = 0.872;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.EURO, CurrencyExchange.POUND);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testPoundToRupee(){
        double expected = 83.317;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.POUND, CurrencyExchange.RUPEE);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testRupeeToCanDollar(){
        double expected = 0.019;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.RUPEE, CurrencyExchange.CANDOLLAR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCanDollarToSingDollar(){
        double expected = 1.083;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.CANDOLLAR, CurrencyExchange.SINGDOLLAR);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testSingDollarToFranc(){
        double expected = 0.706;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.SINGDOLLAR, CurrencyExchange.FRANC);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFrancToRinggit(){
        double expected = 4.425;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.FRANC, CurrencyExchange.RINGGIT);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testRinggitToYen(){
        double expected = 25.914;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.RINGGIT, CurrencyExchange.YEN);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testYenToYuan(){
        double expected = 0.059;
        double actual = CurrencyExchange.convertCurrency(initial, CurrencyExchange.YEN, CurrencyExchange.YUAN);
        Assert.assertEquals(expected, actual, 0.001);
    }

}
