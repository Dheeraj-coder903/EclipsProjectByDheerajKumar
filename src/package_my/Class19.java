package package_my;

import java.util.HashSet;
import java.util.Set;

public class Class19 {

	public static void main(String[] args) {
		Class19 cla = new Class19();
		cla.setcollection();
	}
//it does not allow duplicate value in it
	public void setcollection() {

		Set<String> set = new HashSet<>();

		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		set.add("Dheerajkumar");
		System.out.println(set);

	}

}
