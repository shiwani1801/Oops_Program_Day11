package com.bridgelabz.oopsday11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
    private static List<Stock> stockList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    //Add stock in list
    public static void addStock()
    {
        System.out.println("Enter the stock name");
        String stockName = scan.next();
        System.out.println("Enter no of shares");
        int numOfShares = scan.nextInt();
        System.out.println("Enter price of each share");
        int sharePrice = scan.nextInt();
        int totalPrice = numOfShares * sharePrice;
        Stock obj = new Stock(stockName, numOfShares , sharePrice , totalPrice);
        stockList.add(obj);
    }

    //Print stock details
    public static void printStock()
    {
        if(!stockList.isEmpty())
        {
            System.out.println("Stock details are below.....\n");
            Iterator it = stockList.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        else
            System.out.println("Stock list is empty.");
    }

    public static void main(String[] args) {

        System.out.println("Enter how many stocks you want to add!!!\nGive those stock details below");
        int count = scan.nextInt();
        for (int i = 1; i <= count; i++)
        {
            addStock();
        }

        printStock();
    }
}

