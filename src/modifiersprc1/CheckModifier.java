package modifiersprc1;

import modifiersprc.DefaultModifier;
import modifiersprc.PrivateModifier;
import modifiersprc.ProtectedModifier;
import modifiersprc.PublicModifier;
public class CheckModifier extends ProtectedModifier {

	public static void main(String args[]) {
		new PublicModifier().publicModi();
		new CheckModifier().protectedModi(); // it accessed with child class
		new DefaultModifier(); // method is not accessed even after declaring child because it is default
		new PrivateModifier(); // it method can not called because it has private modifeir and it is access within same package

	}

}
