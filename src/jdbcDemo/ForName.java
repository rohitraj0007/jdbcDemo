package jdbcDemo;

/*
 * class.forName???
 * this method load a class, loading means it will run static block
 */
public class ForName {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Load");
	}
}

class Load {
	/*
	 * static block run when get loaded
	 */
	static {
		System.out.println("Static");
	}
	/*
	 * instance block run when object is created
	 */
	{
		System.out.println("Instance");
	}
}
