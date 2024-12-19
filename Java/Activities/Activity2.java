package hello;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10, 77, 10, 54, -11, 10};
		int searchvalue=10;
		int find=30;
		
		System.out.println("Results:"+ Sumofvalues(array,searchvalue,find));
	}
public static boolean Sumofvalues(int[] array1, int searchvalue, int find) {
	int text=0;
	
		for(int i=0; i<array1.length;i++) {
			if(array1[i]==searchvalue)
			{
				
				text=text+searchvalue;
			}
			
		}
		return text==find;
		
}

}