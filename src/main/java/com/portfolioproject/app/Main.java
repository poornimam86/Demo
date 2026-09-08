package com.portfolioproject.app;

import java.util.Scanner;

import com.portfolioproject.model.User;
import com.portfolioproject.model.Stock;

public class Main {

    public static void main(String[] args) {

        System.out.println("=========================");
        System.out.println("Portfolio Management Project");
        System.out.println("============================");

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read User details
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Create User object
        User user = new User(userId, name, email);

        // Display User values
        System.out.println("\n----- User Details -----");
        System.out.println("User ID: " + user.getUserid());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());

        // Read Stock details
        System.out.print("\nEnter Stock ID: ");
        String stockId = sc.nextLine();

        System.out.print("Enter Stock Name: ");
        String stockName = sc.nextLine();

        System.out.print("Enter Stock Price: ");
        double stockPrice = sc.nextDouble();

        // Create Stock object
        Stock stock = new Stock(stockId, stockName, stockPrice);

        // Display Stock values
        System.out.println("\n----- Stock Details -----");
        stock.display();

        sc.close();
    }
}