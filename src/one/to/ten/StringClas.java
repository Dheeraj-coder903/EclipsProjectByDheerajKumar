package one.to.ten;

public class StringClas {

	
	public static void main(String[]args) {
		
		new StringClas().stringMethod();
	}
	
     public void stringMethod() {
		
		
		System.out.println("i am string");
		System.out.println("my all information is provided below in the page");
	}
	
	
	
//	String= string is a sequenceof character it's a class it has multiple methods such as length(), toUpperCase(), toLowerCase(), trim(), concat() etc.it ceates immutable object
	
	/*
	 * String in Java is a class used to represent a sequence of characters. 
	 * When we write String name = "Dheeraj";, it creates an object in the String Constant Pool. 
	 * But when we use new String("Dheeraj"), it creates a new object in heap memory. 
	 * String objects are immutable, meaning once created, they cannot be changed.
	 * 
	 * 
	 * Immutable (इम्यूटेबल)= जिसे बदला नहीं जा सकता unchanged  once creted object of string it can'nt be change
	 * Mutable (म्यूटेबल)=    जिसे बदला जा सकता है changable    it can be change 
	 */
	
	
   //	Constant (कॉन्स्टेंट) ka Hindi matlab: 
  //👉 स्थिर (Sthir)  
 //👉 जो बदलता नहीं है  isliye  String constant pool bolte hai
	
	
	
	//immutablity string ki main value chnage nahi hogi when you yry the it will create new object
//	 refere kartehai isliye reference variable hote hai
	
//	👉 String literal = jo value tum directly double quotes me likhte ho
//	👉 Constant = jo value fix hoti hai, change nahi hoti
	
	
	/*
	 * 
	 * ab ek interview-famous concept karte hain:
	 * ==vs equals() (String ke saath)
	 *  Example:
	 *  String s1 = "Hello";
	 *  String s2 = "Hello";
	 *  String s3 = new String("Hello");
     *System.out.println(s1 == s2);
     *System.out.println(s1 == s3);
     *System.out.println(s1.equals(s3));
     *🧠 Output:
     *true
     *false
     *true
     *🧠 Samajh lo clearly:
     *🔹 == (Reference compare karta hai)

     *👉 Check karta hai: dono same object ko point kar rahe hain ya nahi

     *s1 == s2 → ✅ true
     *(same pool object)
     *s1 == s3 → ❌ false
     *(s3 alag heap object)
     *🔹 equals() (Value compare karta hai)

     *👉 Check karta hai: content same hai ya nahi

     *s1.equals(s3) → ✅ true
     *("Hello" == "Hello")
     *📦 Memory View:
     *String Pool:
     *  "Hello"  ← s1, s2

     *Heap:
     *  new String("Hello") ← s3
     * 🎯 Interview line:

     *"== compares references (memory location), while equals() compares actual content of the String."
     *
     *⚡ Ek line me yaad rakh:
     *
     *👉 "== address check karta hai, equals() value check karta hai"
	 * 
	 * 
	 * 
	 */
	
	
//👉 "== address check karta hai, equals() value check karta hai"

	
	/*
	 * == vs equals()
	 * ✔️ ==
	 *  reference (memory location) compare karta hai
	 *  equals()
	 *  value/content compare karta hai
	 */
	
	
	
	
/*
 * String literal (without new)
 * Same value → same reference (pool reuse)
 *  Using new
 *  Same value → different reference	
 */
	
/*  "String me concat ya koi bhi modification hoga →
	*reference new object pe shift ho jata hai"
	*
*/
	
	//  String literals with the same value share the same reference from the String pool, 
   //	but using the new keyword creates separate objects even if the value is the same."
	
}
