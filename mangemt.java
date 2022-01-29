import java.util.Scanner;

/**
 * Created by MC on 09/01/2022.
 */
public class mangemt
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student team[]=new Student[3];
//         Student s1=new Student(1,"Haifa");
//        team[0]=s1;
//        Student s2=new Student(2,"Wafa");
//        team[1]=s2;
//        Student s3=new Student(3,"Safa");
//        team[2]=s3;
        for (int i = 0; i <team.length ; i++)
        {
          Student s=new Student(in.nextInt(),in.next()) ;
            team[i]=s;
        }
        for (int i = 0; i <team.length ; i++)
        {
           System.out.println(team[i].toString());
        }
    }
}
