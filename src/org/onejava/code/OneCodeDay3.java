package org.onejava.code;

public class OneCodeDay3 {

	public static void main(String args[]) {

		OneCodeDay3 code = new OneCodeDay3();
		code.splitChar();
	}

	void splitChar() {

		String name = "this is dheeraj kumar";

	String result[]=	name.split(" ");
		char[] array = name.toCharArray();
		for (char arr : array) {

			System.out.println(arr +" " +"  =it is word");
		}

		for (int i = array.length - 1; i >= 0; i--) {

			System.out.print(array[i]);
		}

		System.out.println();
		for(int i=result.length-1;i>=0;i--) {
			System.out.print(result[i]+" ");
			
		}
		
	}
	
	public static void dayThreeMethod(){
		System.out.println(" i am from OneCodeDay3");
		
	}
	

}
