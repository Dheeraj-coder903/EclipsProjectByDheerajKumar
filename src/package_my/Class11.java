package package_my;

public class Class11 {

	public static void main(String[] args) {
		Class11 clas = new Class11();
		int umar = 11;
		clas.condition(umar);
//		byte umr = 1;
//		clas.movicondition(umr);

	}

	public void condition(int age) {

		if (age > 5 || age == 5) {
			System.out.println("your age is " + age + " your are able to enter in the condition");

			if (age < 10 || age == 10) {
				System.out.println(
						"your age is " + age + " you adhar will be ready but you need to give your parent name");
			}
			if (age > 10 || age == 18) {

				System.out
						.println("your age is " + age + " you are eligible to build your adhar without any parent id");
			}

		}
	}

	public void movicondition(byte age) {

		if (age < 18) {

			System.out.println("your age is " + age + " you are not able to watch movie ");
		} else if (age > 18) {

			System.out.println("your age is bigger than " + age + " your are able to watch movie");
		}

	}

}
