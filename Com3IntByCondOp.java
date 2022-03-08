import java.util.*;
public class Com3IntByCondOp{
	public static void main(String[] args) {
		int a,b,c,n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the a : ");
		a = sc.nextInt();
		System.out.println("Enter the b : ");
		b = sc.nextInt();
		System.out.println("Enter the c : ");
		c = sc.nextInt();

		n = a>b ? (a>c ? a : c) : (b>c ? b : c);

		if (n==a) {
			System.out.println("Large number is a: " + n);	
		}else if (n==b) {
			System.out.println("Large number is b: " + n);
		}else if (n==c){
			System.out.println("Large number is c: " + n);
		}
	}
}