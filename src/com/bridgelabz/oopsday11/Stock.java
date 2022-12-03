package com.bridgelabz.oopsday11;

public class Stock {    //Declaring some variables
    private String stockName;
    private int numOfShares, sharePrice, totalValue;

    //Creating one parameterised constructor where I can define everything.
    public Stock(String stockName, int numOfShares, int sharePrice, int totalValue)
    {
        setStockName(stockName);
        setNumOfShares(numOfShares);
        setSharePrice(sharePrice);
        setTotalValue(totalValue);
    }

    //Creating some getter and setter methods.
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = sharePrice*numOfShares;
    }

    //Creating a toString method.
    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", numOfShares=" + numOfShares +
                ", sharePrice=" + sharePrice +
                ", totalValue=" + totalValue +
                '}';
    }
}

