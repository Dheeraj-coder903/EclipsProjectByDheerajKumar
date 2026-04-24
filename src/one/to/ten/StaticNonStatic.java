package one.to.ten;

public class StaticNonStatic {

	public static void main(String[] args) {

		staticMethod(); // direct we can call
		StaticNonStatic.staticMethod(); // with class namw we can call
		// with call name most of the time we call in another class so that we recognise
		// this method belog from which class

		new StaticNonStatic().nonStaticMethod(); // we call direct with object
		StaticNonStatic nonst = new StaticNonStatic();
		nonst.nonStaticMethod();// here we called with reference name of the object
	}

	public static void staticMethod() {

		String nam = ("it's Static Method it loads when class loads itself");
		String nam1 = (" and it can called by CLASS Name or direct with the Method Name");
		System.out.println(nam + nam1);
	}

	public void nonStaticMethod() {
		String non = "it is Non Static Method it can be called by direct creating object ";
		String non1 = " OR after creating object we can call it with t reference name";
		System.out.println(non + non1);
	}
	/*
	 * multiline comment it looks like it we do it to declear java code
	 * with ctrl+f we can change which value we want to change with first lock choosen line with secondline entire page
	 * 
	 */
}
