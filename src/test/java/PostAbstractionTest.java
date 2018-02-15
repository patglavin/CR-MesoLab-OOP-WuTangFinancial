import org.junit.*;

public class PostAbstractionTest {
    public double initialValue;
    USDollar usDollar = new USDollar();
    Euro euro = new Euro();


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
}
