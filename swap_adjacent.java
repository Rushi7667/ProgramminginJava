// WAP to swap adjecent element of one dimention array
import java.util.*;

public class swap_adjacent{
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int n,i,j,temp=0;

		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter the number : ");

		for (i=0; i<a.length-1; i++) {
			temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}

		for (i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}