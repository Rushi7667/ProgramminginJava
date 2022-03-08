import java.util.*;
public class ComparisonOf3Num{
	public static void main(String[] args) {
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of A :");
		a = sc.nextInt();
		System.out.println("Enter value of B :");
		b = sc.nextInt();
		System.out.println("Enter value of C :");
		c = sc.nextInt();

		if (a>b) {
			if (a>c) {
				System.out.println("A is largest:"+a);
			}else{
				System.out.println("C is largest:"+c);
			}
		}else {
			if(b>c){
				System.out.println("B is largest:"+b);
			}
			else{
				System.out.println("C is largest:"+c);
			}
		}
	}
}