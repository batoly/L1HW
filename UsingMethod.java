import java.util.Scanner;

/**
 * Created by Lenovo on 1/18/2022.
 */
public class UsingMethod {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println(" Enter numbers");
        InputArrayElement(a);
        PrintArray(a);

    }
    public static void PrintArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + "\t");
        }
    }

    public static void InputArrayElement(int[] y) {
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <y.length; i++) {
            y[i]=in.nextInt();
        }
    }
}
