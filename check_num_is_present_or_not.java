// Given two arrays 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.

import java.util.*;

public class check_num_is_present_or_not{
	public static void main(String[] args) {
		int[] a = {1,2,13,4,5};
		int[] b = {2,3,1,0,5}; 

		int flag=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {			
				flag=0;
				if (a[i]==b[j]){
					flag=1;
					break;
				}
			}

			if (flag==0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}