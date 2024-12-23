package session3;

import java.util.*;

public class Activity10 {

	public static void main(String[] args) {
		Set<String> hs= new HashSet<String>();
		hs.add("Apple");
		hs.add("Ball");
		hs.add("Cat");
		hs.add("Dog");
		hs.add("pen");
		hs.add("pensil");
		 System.out.println("Original HashSet: " + hs);      
		System.out.println("size of the hashset:"+hs.size());
		System.out.println("removing Dog from list "+hs.remove("Dog"));
		if(hs.remove("bat")) {
        	System.out.println("bat removed from the Set");
        } else {
        	System.out.println("bat is not present in the Set");
        }
		
		System.out.println("Is Ball present in the list:"+hs.contains("Ball"));
		
		System.out.println("Print All the Objects:"+hs);
		
	}

}
