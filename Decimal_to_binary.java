// WAP to convert number from Decimal_to_binary
import java.util.*;

public class Decimal_to_binary{
	public static void main(String[] args) {
		int rem=0,i=0,n;
		int[] a=new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		n = sc.nextInt();

		while(n!=0){
			rem = n%2;
			a[i]=rem;
			n = n/2;
			i++;
		}

		for (i=i-1; i>=0; i--) {
			System.out.print(a[i]);
		}
	}
}