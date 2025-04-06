package Singleton;

public class FactUtil {
	private static FactUtil instance;
	
	private FactUtil() {}
	
	public static FactUtil getInstance() {
		if (instance == null)
			instance = new FactUtil();
		return instance;
	}
	
	public int factorial(int n) {
		int result = 1;
		for(int i=2;i<=n;i++)
			result *=i;
		return result;
	}
}
