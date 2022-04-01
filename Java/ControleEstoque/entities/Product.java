package entities;

public class Product {
    private String name;
    private String brand;
    private String model;
    private String color;
    private String obs;
    private Double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, String brand, String model, String color, String obs, Double price, int quantity) {
		this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
		this.obs = obs;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, String brand, String model, String color, String obs, Double price) {
		this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
		this.obs = obs;
		this.price = price;
	}

    public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

    public void setBrand (String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}

    public void setModel (String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}

    public void setColor (String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

    public void setObs (String obs) {
		this.obs = obs;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
