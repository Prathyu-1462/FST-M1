package session3;

import java.util.*;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList <String> myList= new ArrayList<String>();
		myList.add("Prathyu");
		myList.add("pravali");
		myList.add("moksha");
		myList.add("ram");
		myList.add("shiva");
		System.out.println("Print All the Objects:");
		for( String namelist: myList) {
			System.out.println(namelist);
		}
		System.out.println("3rd element in the list is "+myList.get(2));
		System.out.println("Is Prathyu present in the list: "+myList.contains("Prathyu"));
		System.out.println("size of the list: "+ myList.size());
		
		myList.remove(3);
		System.out.println("size of the list after removing one object from list: "+myList.size());
		
		
		

	}

}
