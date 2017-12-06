public class Singleton {
	private volatile static Singleton uniqueInstance;
	
	// other useful variables here
	
	private Singleton() { /* empty */ }
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}