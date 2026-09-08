package com.portfolioproject.model;

public class Stock
{
	private String stockId;
	private String stockName;
	private double stockPrice;
	
	//Default Constructor
	public Stock()
	{
		
	}
	
	//Parameterized Constructor
	public Stock(String stockId, String stockName, double stockPrice)
	{
		this.stockId=stockId;
		this.stockName=stockName;
		this.stockPrice=stockPrice;
	}
	
	//Display the stock information
	public void display()
	{
		System.out.println("StockId:"+stockId);
		System.out.println("StockName:"+stockName);
		System.out.println("StockPrice:"+stockPrice);
	}
	
	//Create getter and setter
	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	
	
	
}
