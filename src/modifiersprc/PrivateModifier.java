package modifiersprc;

public class PrivateModifier {

	public static void main(String[]args) {
		new PrivateModifier().privateModi();
	}
	
	private void privateModi() {
		System.out.println("private modifier");
		System.out.println("it can be access within the same class not out of the class");
	}
	 
}
