package package_my;

import java.util.ArrayList;
import java.util.List;

public class Class18 {

	public static void main(String[] args) {

		Class18 clas = new Class18();
		clas.collectionofarraylist();

	}

	public void collectionofarraylist() {

		List<String> list = new ArrayList<>();
		list.add("subham"); 
		list.add("hello");
		list.add("i am the god");
		list.add("i am the god");
		list.add("i am the god");
		list.addFirst("i am the god");

		for(String input:list) {
			
			System.out.println("#"+input+"#");
			}

//		for (int i = 0; i <= list.size(); i++) {
//			System.out.println(list.get(i));
//
//		}
	}

	
	
}
