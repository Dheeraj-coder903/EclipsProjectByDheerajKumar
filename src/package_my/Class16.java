package package_my;

public class Class16 {
//we will learn return type 
	// "Integer is a wrapper class in Java that provides the parseInt() method,
	//  Which converts a String into an int."
	//  Equalinoecase String class ke method hai & equalcase object class ka method
	// hai

	public static void main(String[] args) {

		Class16 clas = new Class16();

//		String value = clas.usereturntype();
//		char[] array = value.toCharArray();
//		for (int i = 0; i <= array.length - 1; i++) {
//			System.out.print(" " + array[i]);
//		}
//		clas.matchintvalue();
//		clas.stringchangeint();
//		clas.intintostring();
//		clas.atmpincode();
		clas.atmpin();
	}

	public String usereturntype() {

		String value = "i am return type method hope you know very well";

		return value;

	}

	public void matchintvalue() {

		int a = 1;
		int b = 1;
		if (b == a) {
			System.out.println();
			System.out.println("true int");

		} else
			System.out.println("false");

		String c = "Azad";
		String d = "Barbad";

		if (b == a) {
			System.out.println("true String");
		} else
			System.out.println("false");

	}

	public void stringchangeint() {

		String a = "10";
		// "Integer is a wrapper class in Java that provides the parseInt() method,
		// which return type is "int" &
		// which converts a String into an int."

		int b = Integer.parseInt(a);
		int c = 10;
		if (b == c) {
			System.out.println(" i ma stringchangeint True");

		} else
			System.out.println(" i am stringchangeint fail");

	}

	public void intintostring() {

		// equalinoecase & equalcase String class ke method hai

		int a = 1;
		String b = a + "";
		String c = "1";

		if (b.equalsIgnoreCase(c)) {

			System.out.println("i am intintostring True");
			System.out.println(true);
		} else
			System.out.println(" i am intintostring false");
		System.out.println(false);
	}
//     ATMPIN WITH REGEX
	public void atmpincode() {

		String code = "1234";
		int cod = code.length();

		if (cod == 4 && code.matches("\\d+")) {
			int pin = Integer.parseInt(code);
			if (pin >= 0000 && pin <= 9999) {
				System.out.println("pin successfull " + pin);
			} else
				System.out.println("PIN failed: Must be between 0000 and 9999.");

		} else
			System.out.println(false + "Invalid PIN format: Must be 4 digits.");
	}

	public void atmpin() {

		String code = "131@"; // pin check

		int cod = code.length(); // length string variable ka length lene ke liye diya gaya hai
		// cod==4 isliye diya gaya hai taki lingth hamesha 4 hi rahe badhe ghate na
		if (cod == 4 && code.matches("\\d+")) {// \\d+ ek regex hai jise diya gaya hai taki hamara string variable ka
												// data hamesha value yani ki digits me hi rahe
			int pin = Integer.parseInt(code);
			if (pin >= 0000 && pin <= 9999) {
				System.out.println("your pin is correct u can withrawl your money " + pin);
			} else
				System.out.println("your pin incorrect cann't withral " + pin);
		} else
			System.out.println(" your pin formate is incorrect");

	}

}
