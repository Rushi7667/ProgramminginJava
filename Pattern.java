import java.util.*;

/**
 * Pattern
 */
public class Pattern {
    public static void main(String[] args) {
        int r,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        r = sc.nextInt();

        for (int i = 0; i <= r; i++) {
            for (int j=r-i; j>=1; j--){  
                    //prints space between two stars      
                    System.out.print(" ");   
            } 
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}