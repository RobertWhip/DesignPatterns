public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	
	// other useful variables here
	
	private Singleton() { /* empty */ }
	
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}