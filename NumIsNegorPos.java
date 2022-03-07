import java.util.*;
public class NumIsNegorPos{
	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num : ");
		n = sc.nextInt();

		if (n<0) {
			System.out.println("Number is Negative");
		}
		else if (n>0) {
			System.out.println("Number is Positive");
		}
		else{
			System.out.println("zero");
		}

	}
}