/* 
Write a program to calculate the angle between the hour hand and the minute hand of a clock of the time is given
in string format.
Input: h=12:00 ,m=30:00
Output: 165 degree 
*/

import java.util.*;

public class find_angle_between_two_hands{
	public static void main(String[] args) {
		int h,m;
		double answer;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the hour : ");
		h = sc.nextInt();
		System.out.println("Enter the minute : ");
		m = sc.nextInt();
		
		if(h==12){
			h=0;
		}
		if(m==60){
			m=0;
		}

		double hour = (0.5*((60*h)-m));
		double min = 6*m;

		if (hour>min){
			answer = hour-min;
		}
		else{
			answer = min-hour;
		}

		if (answer>360-answer) {
		 	System.out.println(360-answer);
		}
		else{
			System.out.println(answer);
		}
		// System.out.println(h);
		// System.out.println(m);
	}
}