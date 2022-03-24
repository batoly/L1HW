import java.util.Scanner;

/**
 * Created by Lenovo on 1/18/2022.
 */
public class INPUT {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println(" Input numbers");
        for (int i = 0; i <a.length ; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

}
