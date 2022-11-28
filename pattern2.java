/* Write a program to print following pattern
1  2  3  4  5      
6  7  8  9  10     
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/
import java.util.*;

public class pattern2{
	public static void main(String[] args) {
		int r,k=1,c,d;


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		r = sc.nextInt();
		System.out.println("Enter number of row : ");
		c = sc.nextInt();

		// d=r*c;

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				// for (int k=1; k<=25; k++) {
				// 	System.out.print(k + " ");
					System.out.print(k + " ");
				k=k+1;
			}
				System.out.println();
		}
	}
}