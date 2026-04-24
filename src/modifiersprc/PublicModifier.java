package modifiersprc;

public class PublicModifier {

	public static void main(String[] args) {
		new PublicModifier().publicModi();
		new PrivateModifier(); // it is not accessing due to it access modifier
		new ProtectedModifier().protectedModi();
		new DefaultModifier().defaultModi();
	}

	public void publicModi() {

		System.out.println("public modifiers");
		System.out.println(
				"it can be accessed within the entire project every package evry class eery where in the same project");
	}

}
