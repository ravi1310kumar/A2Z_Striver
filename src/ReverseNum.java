import java.util.Scanner;

public class ReverseNum {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =  sc.nextInt();
        System.out.println(num);
        sc.close();
        System.out.println(ReverseTheNumber(num));
    }

    public static int ReverseTheNumber(int n) {
        int last=0;
        int x=n;
        int rev= 0;
        while (x!=0){
          last=x%10;
          rev= rev*10+last;
          x/=10;
        }

        return (rev);
    }
}
