package one.to.ten;

import java.util.ArrayList;
import java.util.List;

public class Loop {

	public static void main(String[] args) {
//		new Loop().forLoop();
//		new Loop().forEachLoop();
		new Loop().doLoop();
	}

	// there are 4 four kind of loop
	// for loop, for each loop, do loop, do while loop

//	for loop
//	it contains 3 parts initialization condition and udation 
//	for loop execute a block of code as long as specified condition is reached

	public void forLoop() {
		String nam = "";
		for (char i = 'a'; i <= 'z'; i++) {
			nam += i + " ";
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(nam);
	}


// For Each Loop
//	 for each loop works with array and collection 
//	 it get each value one by one from array and containers
	
	public void forEachLoop() {
//		 List list is a collection interface we can not create object of list it has 3 chils
//       List allow duplicate and follow insertion order it's not randome access
//	    Array List, Linked List, Tree List
//		if we have to get data sequence wise then we prefer Array list
//		
		List<String> ls =  new ArrayList<String>();
		ls.add("Dheeraj");
		ls.add("Dheeraj1");
		ls.add("Dheeraj2");
		ls.add("Dheeraj3");
		ls.add("Dheeraj4");
		ls.add("Dheeraj5");
		ls.add("Dheeraj6");
		ls.add("Dheeraj7");
		ls.add("Dheeraj8");
		ls.add("Dheeraj9");
		ls.add("Dheeraj10");
		
		for(String ad:ls) {
			
			System.out.println(ad);
		}
		
	}

	
//	do while Loop
//	 do loop it is exit check loop
//	/it runs at least once whether condits is false 
	
	public void doLoop() {
		
		int age =10;
		
		do {
			System.out.println("i ma Ram i am adult to watch movie my age is "+age);
		}while(age>=18); {
			age++;
		}
		
		
		
		
		
	}
	
	
	
}