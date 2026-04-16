package package_my;

import java.util.HashMap;
import java.util.Map;

public class Class20 {

	public static void main(String[] args) {

		Class20 cla = new Class20();
		cla.mapcollection();
	}

	public void mapcollection() {

		Map<String, Integer> map = new HashMap<>();

		map.put("DheerajKumar", 22);
		map.put("SurajKumar", 22);
		map.put("MaheshKumar", 22);
		map.put("VinodKumar", 24);
		map.put("SubhamKumar", 24);
		map.put("NeerajKumar", 24);
		//alag alag line me print karane ke liye hame (foreach+entryset)ka use karna padega
			
		 // Alag-alag line me print karne ke liye
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
		
		
		}
	}


