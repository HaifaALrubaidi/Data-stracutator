import java.util.Scanner;

/**
 * Created by MC on 28/01/2022.
 */
public class Q1 {
    public static void main(String[] args) {
        ArrayStack_1<Integer>S=new ArrayStack_1<>(5);
        ArrayStack_2<Integer>T=new ArrayStack_2<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 elements");
        for (int i = 0; i <5 ; i++) {
            S.push(in.nextInt());
            System.out.println("The top of S is "+S.top());
        }

        System.out.println("Calling Stack T 11");
        for (int i = 0; i <5 ; i++) {
            T.push(S.pop());
            System.out.println(" The top of T is "+T.top());
        }
    }
}
