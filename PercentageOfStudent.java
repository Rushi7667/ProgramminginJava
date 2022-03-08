import java.util.*;

public class PercentageOfStudent{
	public static void main(String[] args) {
		int s1,s2,s3,s4,s5,cls;
		double per;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of Subject 1 :");
		s1 = sc.nextInt();
		System.out.println("Enter marks of Subject 2 :");
		s2 = sc.nextInt();
		System.out.println("Enter marks of Subject 3 :");
		s3 = sc.nextInt();
		System.out.println("Enter marks of Subject 4 :");
		s4 = sc.nextInt();
		System.out.println("Enter marks of Subject 5 :");
		s5 = sc.nextInt();

		per=(s1+s2+s3+s4+s5)/5.0;

		if (per<=100) {
			System.out.println("percentage of Student is : " + per);	
		}else{
			System.out.println("Wrong marks entered");
		}

		if (per<35) {
			System.out.println("Fail");
		}else if(per>=35 && per<45){
			System.out.println("Pass class");
		}else if (per >=45 && per<60) {
			System.out.println("Second Class");
		}else if (per>=60 && per<70) {
			System.out.println("First class");
		}else if (per>=70 && per<=100) {
			System.out.println("Distinction");
		}

	}
}