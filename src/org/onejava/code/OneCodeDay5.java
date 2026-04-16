package org.onejava.code;

public class OneCodeDay5 {

	public static void main(String[] args) {

		int a;
		a = 10;
		a = 15;
		System.out.println(a);
		int b, c, d;
		b = 10;
		c = 11;
		d = 15;
		// latest wala print hoga latest waa hota hai pura chhod deta hai
		System.out.println(b + c + d + a);
		// yaha upar variabe me store kara ke diye hai
		int umar = 11;
		String nam = "sonu";
		nam(umar, nam);
		nam(10, "sonu");// direct bhi int string de sakte hai
		String pata = lenaHai();
		System.out.println(pata);

	}

	public static void nam(int age, String sham) {
		if (age == 10) {
			System.out.println("you are under age" + age + sham);

		} else
			System.out.println(" you are paglet ");

	}

	public static String lenaHai() {
		String address = "i am dheera kumar from bhadohi and may i know where are you from ";
		return address;

	}
	
	public static void daySixMethod(){
		System.out.println(" i am from OneCodeDay6");
		
	}
	

}
