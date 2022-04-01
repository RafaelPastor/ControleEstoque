package application;

import java.util.Scanner;

import entities.Product;


public class Program{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Brand: ");
		String brand = sc.nextLine();
		System.out.print("Model: ");
		String model = sc.nextLine();
		System.out.print("Color: ");
		String color = sc.nextLine();
		System.out.print("Obs: ");
		String obs = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		Product product = new Product(name, brand, model, color, obs, price);
		int quantity = sc.nextInt();
        product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product: " + product.getName() + "\n" + 
        "Brand: " + product.getBrand() + " | Model: " + product.getModel()  + " | Color: " + product.getColor() + 
        "\n" + "Obs: " + product.getObs() 
        + "\n" + "Price: $ " + product.getPrice() + " | Quantity: " + product.getQuantity());
		
		sc.close();
	}
     		
}