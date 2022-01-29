import java.util.Arrays;

/**
 * Created by MC on 20/01/2022.
 */
public class Q2 {
    public static void main(String[] args) {
        String x[]={"Haifa","Wafa","Safa","Ahmed"};
        String z[]=new String[x.length];
        for (int i = 0; i <4 ; i++) {
            z[i]=x[i];
        }
        System.out.println(Arrays.toString(z));
    }
}
