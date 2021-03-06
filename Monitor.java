package Computer;

public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixel(int x, int y, String color)
	{
		System.out.println("Drawing pixel at "+x+","+y+" in color "+color);
	}

	public String getModel() {
		System.out.println(model);
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		nativeResolution.getHeight();
		return nativeResolution;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setNativeResolution(Resolution nativeResolution) {
		this.nativeResolution = nativeResolution;
	}
	
}
