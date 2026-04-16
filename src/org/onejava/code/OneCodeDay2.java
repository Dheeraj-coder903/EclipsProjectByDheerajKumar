package org.onejava.code;

public class OneCodeDay2 extends OneCodeDay1 {

	public static void main(String[] arg) {

		OneCodeDay2 day2 = new OneCodeDay2();

		day2.fibonaciSeries();
		day2.name1();
		String nameResult = day2.name2();
		System.out.println(nameResult);
		String uttar = day2.name3();
		System.out.println(uttar);
		day2.variable();
		day2.whileloop();
		day2.doLoop();
	}

	void name1() {
		System.out.print("i am dheeraj Kuamr");
		System.out.println("i am dheeraj kumar");
		System.out.print("dheeraj kumar neeraj kumar");
		System.out.println();
	}

	private String name2() {

		String name = "Suraj";
		return name;
	}

	protected String name3() {

		return "surya";
	}

	public void variable() {

		int a = 1;
		byte b = 127;
		long l = 123456789;
		short s = 12345;
		double d = 123;
		boolean o = true;
		char c = 'A';
		float f = 899;

		System.out.println(a + b + l + s);
		System.out.println(d);
		System.out.println(o);
		System.out.println(c);
		System.out.println(f);

	}

	void whileloop() {

		int a = 1;
		while (a == 1) {
			System.out.println("i am true while loop");
			a++;

		}

	}

	void doLoop() {

		int age = 10;

		do {

			System.out.println("i am do loop print once" + age);
			age++;
		} while (age == 15);

	}
	
	
	public static void dayTwoMethod(){
		System.out.println(" i am from OneCodeDay2");
		
	}
	

}
