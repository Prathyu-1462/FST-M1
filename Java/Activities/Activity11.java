package session3;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		Map<Integer,String> colours= new HashMap<>();
		 colours.put(1,"red");
		 colours.put(2,"white");
		 colours.put(3,"pink");
		 colours.put(4,"Blue");
		 colours.put(5,"Black");
		 System.out.println("original_map:"+ colours);
		 colours.remove(1);
		 System.out.println("after removing red:"+colours);
		 if(colours.containsValue("Green")) {
	            System.out.println("Green exists in the Map");
	        } else {
	            System.out.println("Green does not exist in the Map");
	        }
		 System.out.println("Size of the map "+ colours.size());
		
		 
		
	}

}
