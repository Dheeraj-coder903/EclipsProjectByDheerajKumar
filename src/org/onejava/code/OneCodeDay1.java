package org.onejava.code;

public class OneCodeDay1{

	public static void main(String args[]) {
		OneCodeDay1 code = new OneCodeDay1();
//		code.dayOne();
//		code.replaceName();
//		code.fibonaciSeries();
//		code.lowerCase();
//		code.upperCase();
//		code.evenOdd();
//next day code
		code.duplicateFind();
	}

	public void dayOne() {
		System.out.println("it's 16-feb-2026");

		int[] number = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int num : number) {
			if (num % 2 == 0) {
				System.out.println(num + " it is Even");
			} else {
				System.out.println(num + " it is Odd");
			}

		}

		for (int i = 0; i <= number.length - 1; i++) {
			if (number[i] % 2 == 0) {
				System.out.println(number[i] + " it is Even ...");
			} else {
				System.out.println(number[i] + "  it is Odd ...");
			}

		}

	}

	public void replaceName() {

		String name = "i @#Love%$&*My @#()India@#$";
		String result = name.replaceAll("[^A-Za-z]", " ");
		System.out.println(result);

	}

	public void fibonaciSeries() {

		int a = 0;
		int b = 1;

		for (int i = 0; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);

			a = b;
			b = c;
			System.out.println("it's done");

		}

	}

	public void lowerCase() {

		String lower = "I AM DHEERAJ CHAUDHARY I AM FROM BHADOHI";

		String cae = lower.toLowerCase();
		System.out.println(cae);

	}

	public void upperCase() {

		String casse = "i am dheeraj chaudhary i am from bhadohi as well as maharastra";

		String cse = casse.toUpperCase();
		System.out.println(cse);

	}

	public void evenOdd() {

		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i + "  it is Even Number");
			} else {
				System.out.println(i + "  it is Odd Number");
			}

		}

		int[] arr = new int[10];

		// assign values
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// check even odd
		for (int nam : arr) {

			if (nam % 2 == 0) {
				System.out.println("it is Even== " + nam);
			} else {
				System.out.println("it is Odd== " + nam);
			}

		}

	}

	public void duplicateFind() {

		String name[] = { "rina", "meena", "teena", "rina", "meena", "teena", "rina", "meena", "teena" };

		for (int i = 0; i <= name.length; i++) {

			for (int j = 0; j <= name.length; j++) {
				if (name[i] == name[j]) {
					System.out.println(i);
				}

			}

		}

	}
	
	public static void dayOneMethod(){
		System.out.println(" i am from OneCodeDay1");
		
	}
	
	

}
