package application;

import java.util.Scanner;

import entities.Product;


public class Program{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
		
		System.out.println("Insira as informações do produto");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Marca: ");
		String brand = sc.nextLine();
		System.out.print("Modelo: ");
		String model = sc.nextLine();
		System.out.print("Tamanho: ");
		String size = sc.nextLine();
		System.out.print("Cor: ");
		String color = sc.nextLine();
		System.out.print("Observação: ");
		String obs = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade: ");
		Product product = new Product(name, brand, model, color, obs, size, price);
		int quantity = sc.nextInt();
        product.addProducts(quantity);
		
		System.out.println();
		System.out.println(product);

		sc.nextLine();
		System.out.println();
		System.out.print("Deseja adicionar algum item? (S/N) ");
		String opc = sc.nextLine();

		switch (opc) {
			case "S":
				System.out.println();
				System.out.print("Insira a quantidade que deseja adicionar no estoque: ");
				quantity = sc.nextInt();
				
				product.addProducts(quantity);
				System.out.println();
				System.out.println(product);
			break;
			case "N":
				System.out.println("Inclusão Finalizada!");
			break;
			default:
			System.out.println("Opção invalida!");
			break;
		}

		sc.nextLine();
		System.out.println();
		System.out.print("Deseja remover algum item? (S/N) ");
		String opc2 = sc.nextLine();

		switch (opc2) {
			case "S":
				System.out.println();
				System.out.print("Insira a quantidade que deseja remover no estoque: ");
				quantity = sc.nextInt();
				product.removeProducts(quantity);
				System.out.println();
				System.out.println(product);
			break;
			case "N":
			System.out.println("Remoção Finalizada!");
			break;		
			default:
			System.out.println("Opção invalida!");
			break;
		}

		System.out.println();
		System.out.println("Controle de Estoque Finalizado!");
		
		sc.close();
	}
     		
}