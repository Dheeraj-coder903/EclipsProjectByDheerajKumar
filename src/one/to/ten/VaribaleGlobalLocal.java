package one.to.ten;

public class VaribaleGlobalLocal {
// local variable can be accessed within the same method it can'nt get null value
//	global variable or instance variable / class variable variable can be accessed entire project as per the defined Access modifiers it contains null value
// varivale are container for stornig data	
	
	
	
	/* Local variable: method ke andar hota hai, default value nahi hoti, use se pehle initialize karna padta hai.

*Instance (global) variable: class ke andar hota hai, access modifier ke according accessible hota hai, aur default value hoti hai (jaise null, 0, false).
*
*Variable: data store karne ka container hota hai.*/
	
	String name ="dheeraj chaudhary"; // Global variale
	//Global varibale can be define under class not any method even not main method

	public static void main(String[] args) {
		new VaribaleGlobalLocal().localVariable();
	}
	
	public void localVariable() {
		
		int a=10;
		System.out.println(a+"\n"+name);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
