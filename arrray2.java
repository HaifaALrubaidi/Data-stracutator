import java.util.Scanner;

/**
 * Created by MC on 09/01/2022.
 */
public class arrray2
{
    public static void main(String[] args) {
        int a[]=new int[6];
        Scanner in=new Scanner(System.in);
        System.out.println("Enteer numbers");
        for (int i = 0; i <a.length ; i++) {
           a[i]= in.nextInt();
        }
        System.out.println("print arrays");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+"\t ");
        }
    }
}
