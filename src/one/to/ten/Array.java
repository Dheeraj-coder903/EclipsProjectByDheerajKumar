package one.to.ten;

public class Array {
//  Array = a collection of elements of the same data type
//	sabka index (0 se start) hota hai.

//	Array ek data structure hai jisme same type ke multiple elements or data ek hi variable me store kiye jaate hain, aur sabka index (0 se start) hota hai.

	public static void main(String[] args) {
		new Array().array();
	}
	public void array() {
		String[] are = { "dheeaj", "neeraj", "suraj", "rahul", "suresh", "mahesh", "surakhshaw" };
		for (String ar : are) {
			System.out.println(ar);
		}
	}
}