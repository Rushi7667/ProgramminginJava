// WAP to check given number is pelindrome or not
import java.util.*;

public class pelindrome{
	public static void main(String[] args) {
		int a,rev=0,temp1=0,temp2=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		a = sc.nextInt();

		temp1=a;

		while(temp1>0){
			temp2 = temp1%10;
			rev = rev*10 + temp2;
			temp1 = temp1/10;
		}
		// System.out.println(temp);
		System.out.println(rev);

		if (rev == a) {
			System.out.println("number is pelindrome.");
		}
		else{
			System.out.println("number is not pelindrome.");
		}
	}
}