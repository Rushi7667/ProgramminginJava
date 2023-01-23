// Write a program to create circle class with area function to find area of circle
import java.util.*;

public class areaOfCircle{
    public static void main(String[] args) {
        int r;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        r = sc.nextInt();

        areaOfCircle a = new areaOfCircle();

        System.out.println(a.Area(r));
    }

    double Area(int r){
        double area;

        area = 3.14*r*r;

        return area;
    }
}