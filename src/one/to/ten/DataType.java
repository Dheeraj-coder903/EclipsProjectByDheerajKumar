package one.to.ten;

public class DataType {

	
	public static void main(String []args) {
		
		new DataType().primitiveDataType();
	}
	
	public void primitiveDataType() {

		int i = 10;
		byte b = 127;
		long l = 9936291232l;
		short s = 1232;
		double d = 99.100;
		boolean bu = true;
		float f = 100.99f;
		char c = 'a';
		System.out.println(i+"\n"+b+"\n"+l+"\n"+s+"\n"+d+"\n"+bu+"\n"+f+"\n"+c);

	}
	/*
	 *  System.out.println("Hello\nWorld");
	 * Output: 
	 * Hello 
	 * World
	 */


//	System.out.println("Hello\\nWorld");
	// Hello\nWorld

	/*
	 * System.out.println("Hello\\n\nWorld");
	 *  Output:
	 * Hello\n 
	 * World
	 */

}
