package interphace.packaage;

public interface InterPhase {

	public void hello();
	 void hi();
	 public static void guru() {
		 
	 }
	public default void gurugram() {
		
	}
	
	public default void lallu(){
		
	}
	
	
	
//	ye concept webdriver and all browser driver me use hota hai
//	like WebDriver ko Interface bana ke sare methods declear kar diye isme and then 
//	All browser me Impliments keyword ke sath me impliment kar dete hai taki override hoke yaha ka method yani child class ka method mil jaye 
//	jisme inherit karnege Interface class ko usme sare declered method ko Implimant karna padega body dena padega
	
	
/* we use interface to override mthod 
 * can not be create object of interface
 * we can create only unimpliment method 
 * but make it impliment we use default and static keyword
 * we make interface mainly in parent class in order to override method of subclass
 * we declear methods only in interface and use in it child class by inheritance concept 
 * using Implements key word
 * 
 * interface in java are used to achive Abstraction and Implimant multiple inheritance {Imlements}
 * */
	
//	public class ChromeDriver implements WebDriver {
    // yaha WebDriver ke methods ka implementation hota hai
}
	
	
