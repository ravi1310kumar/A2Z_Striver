import java.util.*;

public class CountDigit {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The count of digit is "+digitCount(n));
    }

    public static int digitCount(int a){
        int cnt=0;
        while(a!=0){
            a/=10;
            cnt++;
        }
        return cnt;
    }
}
