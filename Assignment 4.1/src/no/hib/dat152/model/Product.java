package no.hib.dat152.model;

public class Product {
	
	private static int uuid = 0;
	
	private Integer id;
	private String name;
	private Double price;
	private String imageFile;
	
	public Product(String name, double price, String imageFile) {
		this.id = uuid;
		this.name = name;
		this.price = price;
		this.imageFile = imageFile;
		
		uuid++; // increment id generator.
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
}
