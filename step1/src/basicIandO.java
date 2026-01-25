import java.util.Scanner;

public class basicIandO {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("I am ready to do DSA in java");
        int n = sc.nextInt();sc.nextLine();
        System.out.println("The number is "+n);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(Integer.parseInt(str));
        int a = Integer.parseInt(str);
        System.out.println(Integer.SIZE/8);

    }
}
