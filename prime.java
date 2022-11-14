// WAP to check given nnumber is prime or not
import java.util.*;

public class prime{
	public static void main(String[] args) {
		int a,flag=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		a = sc.nextInt();

		for (int i=2; i<a; i++) {
			if (a%i==0) {
				flag=1;
				break;
			}
		}

		if (flag==0) {
			System.out.println("number is prime.");
		}else{
			System.out.println("Number is not prime.");
		}
	}
}	