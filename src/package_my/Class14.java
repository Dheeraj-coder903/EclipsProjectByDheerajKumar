package package_my;

public class Class14 {

	// in this class we will learn about do & do while loop and we will apply
	// condition with loops
	// break and continue also we will

	public static void main(String[] args) {
		Class14 clas = new Class14();
//		clas.doloop();
//		clas.doloopwithcondition();
		clas.whileloop();
	}

//do loop is exit check loop 
	public void doloop() {

		int age = 5;

		do {
			System.out.println(" your are now elder you should go for earn mony it is improtant" + age);
			age++;
		} while (age <= 20);

	}

	public void doloopwithcondition() {

		int age = 5;

		do {
			if (age <= 10) {
				System.out.println(" your are now elder you should go for earn mony it is improtant" + age);
			}
			age++;
		} while (age <= 20);

	}

	// while loop is entry check loop
	public void whileloop() {
		byte uamr = 0;
		while (uamr<=10) {

			System.out.println("your umar is greater than 12 you are able to go mumbai by tarin" + uamr);
			uamr++;

		}

	}

}
