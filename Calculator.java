import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int n,a,b,sum,diff,mul,div;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of A :");
        a = sc.nextInt();
        System.out.print("Enter Value of B :");
        b = sc.nextInt();

        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for Exit");
        n = sc.nextInt();
        
        switch (n) {
            case 1:
                sum=a+b;
                System.out.println("Sum of A and B is " + sum);
                break;
            case 2:
                diff=a-b;
                System.out.println("Diffrence of A and B is " + diff);
                break;
            case 3:
                mul=a*b;
                System.out.println("Multiplication of A and B is " + mul);
                break;
            case 4:
                div=a/b;
                System.out.println("Division of A and B is " + div);
                break;
            case 5:
                break;
        
            default:
                System.out.println("YOU HAVE ENTERED WRONG CHOICE");
                break;
        }
    
    }
}
