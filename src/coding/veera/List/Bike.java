package coding.veera.list;

public class Bike {
	
	int model;
	
	String manufacturer;
	
	double milage;

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public Bike(int model, String manufacturer, double milage) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", manufacturer=" + manufacturer + ", milage=" + milage + "]";
	}
	
	
	
	

}
