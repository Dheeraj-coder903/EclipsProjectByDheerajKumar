package package_my;

public class Class10 {

	// is class me Duplicate string, int and toCharArray(); ka use hua hai

	public static void main(String[] args) {
		Class10 clas = new Class10();
//		clas.acendingorder();
//	    clas.indexnestedloop();
//		clas.tocharaaray();
		clas.lengthWala();

	}

	public void acendingorder() {

		String[] array = { "Dheeraj", "Neeraj", "Suraj", "Balram", "Vijay", "Dheeraj", "Neeraj", "Suraj", "Balram",
				"Vijay", "Dheeraj", "Neeraj", "Suraj", "Balram", "vikas ", "manish", "Vijay" };

		for (int i = 0; i <= array.length - 1; i++) {

			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i].equals(array[j])) {
					System.out.println(array[j]);
					break;
				}

			}

		}

	}

	public void indexnestedloop() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1,
				2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i <= array.length - 1; i++) {

			for (int j = i + 1; j <= array.length - 1; j++) {

				if (array[i] == array[j]) {

					System.out.print(array[i]);

				}

			}

		}

	}

	public void tocharaaray() {

		String variable = "i am from india countary what about you tell me ";

		char[] chararray = variable.toCharArray();

		System.out.print(chararray);
		System.out.println();

		for (int i = 0; i <= chararray.length - 1; i++) {

			System.out.print(chararray[i]);

		}

	}

	public void lengthWala() {

		int[] num = { 1, 3, 4, 5, 5, 6, 7 };

		for (int i = 0; i <= num.length - 1; i++) {
			System.out.print(num[i] + ",");
		}

	}

	public static void classTen() {
		System.out.println("class 10 passed from another package");
	}

}
