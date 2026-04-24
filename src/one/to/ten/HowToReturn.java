package one.to.ten;

public class HowToReturn {

//	  we use return keyword to get somthing from method 
//or  we use return keyword to send a value from method
	public static void main(String[] args) {

		int[] arr = new HowToReturn().returmMethd();

		for (int ar : arr) {
			System.out.println(ar);
		}

		String nam = new HowToReturn().good();
		System.out.println(nam);
	}

	private int[] returmMethd() {

		int a = 0, b = 1;

		int arr[] = new int[21];
		for (int i = 0; i <= 20; i++) {
			int c = a + b;
			arr[i] = c;
			a = b;
			b = c;
		}
		return arr;

	}

	public String good() {

		String name = "my name is dheeraj kumar and i live in delhi ";
		return name;
	}

}
