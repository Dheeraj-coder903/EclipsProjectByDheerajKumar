package package_my;

public class Class15 {
//Switch case 👉 "Switch case checks a value and runs the matching block of code." ✅
//we use switch case where 1 value and multiple statement
	public static void main(String[] args) {
		Class15 clas = new Class15();
//		String akshar = "C";
//		byte din = 2;
		short storedata = 5;
//		clas.switchcaseint(din);
//		clas.switchcasestring(akshar);
		clas.switchcasestoredatainstring(storedata);

	}

	public void switchcaseint(byte day) {

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("no day match");
			break;

		}
	}

	public void switchcasestring(String alphbet) {

		switch (alphbet) {

		case "A":
			System.out.println("i am from String A Sunday");
			break;
		case "B":
			System.out.println("i am from String B Monday");
			break;
		case "C":
			System.out.println("i am from String C Tuesday");
			break;
		case "D":
			System.out.println("i am from String D Wednesday");
			break;
		case "E":
			System.out.println("i am from String E Thursday");
			break;
		case "F":
			System.out.println("i am from String F Friday");
			break;
		case "G":
			System.out.println("i am from String G Saturday");
			break;
		default:
			System.out.println("i am from String No Day");
			break;

		}

	}

	public void switchcasestoredatainstring(short value) {

		String store = "";
		switch (value) {

		case 1:
			store = "i am storing data in switch case 1";
			break;
		case 2:
			store = "i am storing data in switch case 2";
			break;
		case 3:
			store = "i am storing data in switch case 3";
			break;
		case 4:
			store = "i am storing data in switch case 4";
			break;
		case 5:
			store = "i am storing data in switch case 5";
			break;
		case 6:
			store = "i am storing data in switch case 6";
			break;
		case 7:
			store = "i am storing data in switch case 7";
			break;
		default:
			store = "i am storing data in switch case default";
			break;

		}
		System.out.println(store);
	}

}
