import java.util.*;
class TelePhoneBill{
    public static void main(String[] args) {
        int call;
        double bill=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number of calls : ");
        call = sc.nextInt();

        if (call<=100) {
            bill = 200;
            System.out.println("Bill of Telephone is : " + bill);
        }else if (call>100 && call<=150) {
            bill = (200 + (0.60*(call-100)));
        }else if (call>150 && call <=200) {
            bill = 200 + (0.60*(150-100)) + (0.50*(call-150));
        }else if (call>200) {
            bill = 200 + (0.60*(150-100)) + (0.50*(200-150)) + (0.40*(call-200));
        }

        System.out.println("Your total bill is : " + bill);
    }
}