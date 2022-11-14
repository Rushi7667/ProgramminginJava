import java.util.*;

public class binarysearch{

    static void bsearch(int a[], int x){
        int low = 0, high = a.length-1;

        while (high-low>1) {
            int mid = (high+low)/2;

            if (a[mid] < x) {
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        if (a[low]==x){
            System.out.println("element found at position : " + low);
        }
        else if (a[high]==x) {
            System.out.println("Element found at position : " + high);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,9};
        int find;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the element to be find");
        find = sc.nextInt();
        bsearch(arr, find);
    }
}