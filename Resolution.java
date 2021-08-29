package Computer;

public class Resolution {
	private int width;
	private int height;
	public Resolution(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		System.out.println("Height is "+height);
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
