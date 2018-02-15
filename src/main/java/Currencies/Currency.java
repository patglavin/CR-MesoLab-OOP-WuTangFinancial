package Currencies;

public abstract class Currency {
    private String name;
    private double exchangeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(double exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public Currency(String name, double exchangeValue) {
        this.name = name;
        this.exchangeValue = getExchangeValue();
    }

    public Currency(){
        this("rocks", 0);
    }
}
