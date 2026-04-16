package package_my;

public class Class13 {

	public static void main(String[] args) {
		Class13 clas = new Class13();
		clas.fibonacciseries();
	}

	public void fibonacciseries() {

		int a = 0;
		int b = 1;

		for (int i = 0; i <= 20; i++) {

			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

}
