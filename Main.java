package Computer;

public class Main {
	
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
		
		Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		
		PC thePC = new PC(theCase, theMonitor, theMotherBoard);
		
		thePC.getMonitor().drawPixel(1500, 1200, "red");
		thePC.getMonitor().getModel();
		thePC.getMonitor().setModel("28inch Beast");
		thePC.getMonitor().getModel();
		thePC.getMonitor().getNativeResolution();
		thePC.getMonitor().setNativeResolution(new Resolution(2540, 1441));
		thePC.getMonitor().getNativeResolution();
	}
}
