package Session1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
	
	// Initialize a new ArrayList
	static ArrayList<String> list;
	
	@BeforeEach
	public void setup() throws Exception{
		list =new ArrayList<String>();
		
		// Add values to the list
		list.add("alpha"); // at index 0
		list.add("beta"); // at index 1
		
	}
	@Test
	public void insertTest() {
		assertEquals(2, list.size(),"wrong size");
		list.add("apple");
		assertEquals(3, list.size(), "Wrong size");
		assertEquals("alpha", list.get(0), "Wrong element");
		assertEquals("beta", list.get(1), "Wrong element");
		assertEquals("apple", list.get(2), "Wrong element");
	}
	
	@Test
	public void replaceTest() {
		assertEquals(2, list.size(),"wrong size");
		list.add("cat");
		list.set(1, "ball");
		assertEquals("alpha", list.get(0), "Wrong element");
		assertEquals("ball", list.get(1), "Wrong element");
		assertEquals("cat", list.get(2), "Wrong element");
	}
	
	
}
