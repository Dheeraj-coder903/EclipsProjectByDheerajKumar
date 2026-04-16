package package_my;

public class Class9 {

	public static void main(String[] args) {

		Class9 clas = new Class9();

//		int nam = 11;
//		clas.parametermethod(nam);
//		clas.arrays();
//		clas.indexarray();
//		clas.negationkey();
//		clas.uppercase();
	}

	public void parametermethod(int numer) {

		if (numer == 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(2 + " X " + i + " = " + 2 * i);
			}

		} else if (numer == 15) {

			for (int i = 1; i <= 10; i++) {
				System.out.println(3 + " X " + i + " = " + 3 * i);
			}

		} else
			System.out.println("i am not and table");

	}

	public void arrays() {

		String name = "i loive my india countary";

		String[] arr = name.split(" ");

		for (int i = 0; i <= arr.length - 1; i++) {

			System.out.println(arr[i]);
		}

		// for (int i= arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//
//		}
//
//		for (String aar : arr) {
//			System.out.println(aar);
//		}

	}

	public void indexarray() {

		int[] array = new int[10];

		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;

		for (int i = 0; i <= array.length - 1; i++) {

			System.out.print(" " + array[i]);
		}

	}

	public void negationkey() {

		String negat = "i!@#123456love@#$%my$%^&*india*()";

		String replaceall = negat.replaceAll("[^a-zA-Z1-23456]", " ");
		System.out.println(replaceall);

	}

	public void uppercase() {
		String low = "   i am from india  ";

		System.out.println(low.toUpperCase());

		// Note: .trim() sirf shuru (leading) aur end (trailing) ke spaces ko remove
		// karta hai, beech ke spaces ko nahi!
//    space ko remove karne ke liye 
		System.out.println(low.trim());
//	 String uppercaseprint= low.toUpperCase();
//	 System.out.println(uppercaseprint);
		String upper = "I AM A BHARTIYA";
		System.out.println(upper.toLowerCase());

	}
}
