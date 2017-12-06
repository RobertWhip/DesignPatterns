public class Singleton {
	private static Singleton uniqueInstance;
	
	// other useful instance variables here
	
	private Singleton() { /* empty */ }
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}
}