package com.Practies;

import java.util.Arrays;

public class MaxNdMinArray {
	static int max;
	  static int min;
public static void main(String[] args) {
	int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    max = array[0];
    min = array[0];
    int len =array.length;
    for (int i = 1; i < len-1; i=i+2) {
    	if (i+2>len){
    		if (array[i]>max) max = array[i];
    		if (array[i]<min) min = array[i];
    	}
		
    	if (array[i] > array[i + 1]) {
    		if (array[i] > max) max = array[i];
    		if (array[i + 1] < min) min = array[i + 1];
    	}
	}
    
    
    
    System.out.println(" Original Array: "+Arrays.toString(array));
    System.out.println(" Maximum value for the above array = " + max);
    //System.out.println(" Minimum value for the above array = " + min);
}

	   /***
	    *  public static void max_min(int my_array[]) {
	        max = my_array[0];
	        min = my_array[0];
	        int len = my_array.length;
	        for (int i = 1; i < len - 1; i = i + 2) {
	            if (i + 1 > len) {
	                if (my_array[i] > max) max = my_array[i];
	                if (my_array[i] < min) min = my_array[i];
	            }
	            if (my_array[i] < my_array[i + 1]) {
	                if (my_array[i] < min) min = my_array[i];
	                if (my_array[i + 1] > max) max = my_array[i + 1];
	            }
	        }
	    }
	    */

}
