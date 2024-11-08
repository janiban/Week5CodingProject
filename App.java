package Week5;

public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		
		Logger spacedLogger = new SpacedLogger();
		
		System.out.println("TESTING ASTERISK:");
		
		System.out.println(" ");
		
		asteriskLogger.log("This was hard");
		asteriskLogger.error("Need More Caffeine");
		
		
		System.out.println(" ");
		
		System.out.println("TESTING SPACED:");
		
		System.out.println(" ");
		
		spacedLogger.log("Hello Friends");
		spacedLogger.error("Malfunction");
		
		
	}

}
