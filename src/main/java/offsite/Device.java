package offsite;

public class Device {

	private int id;
	private String brand;
	private String model;

	public Device(int id, String brand, String model) {
		this.id = id;
		this.brand = brand;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

}
