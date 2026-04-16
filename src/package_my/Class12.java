package package_my;

public class Class12 {
	public static void main(String[] args) {
		Class12 cla = new Class12();
//		cla.reveresecharacter();
		cla.man();
	}

	public void reveresecharacter() {

		String array = "I am from india country";
		String temporaily = "";
		char[] chararray = array.toCharArray();
//		String[] chararray = array.split(" ");
		for (int i = chararray.length - 1; i >= 0; i--) {
			temporaily = temporaily + " " + chararray[i];

		}
		System.out.println(temporaily);
	}

	
	
	public void man() {
		String nam =" i am dheeraj kumar";
		
		char[] nn=nam.toCharArray();
		
		for(int i=nn.length-1; i>=0; i--) {
		System.out.print(nn[i]);
		}
		
		
	}
}
