import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Table {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose TABLE you want to know: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * "+ i+" = "+i*n);
        }

    }
}
