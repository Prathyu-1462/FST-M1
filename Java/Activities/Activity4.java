package hello;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] array= {6,19,34,2,1,12};
		System.out.println("Array before sorting: "+ Arrays.toString(array));
		int[]array1=sort(array);
		System.out.println("Array after sorting: "+Arrays.toString(array1));

	}

public static int[] sort(int[] array){
	int temp,j;
	for(int i=1;i<array.length;i++) {
		 int a=array[i];
		 
		 for (j=i-1;j >= 0 && a < array[j];--j) {
                array[j + 1] = array[j];

            }
            array[j + 1] = a;
		
	}
	return array;
}
}

