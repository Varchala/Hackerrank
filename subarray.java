import java.io.*;
import java.util.*;

public class subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int c=0,sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
          sum=0;
            for(int j=i;j<n;j++) //6 7 -8 -9 7
            {
                sum=sum+a[j];
  
            if(sum<0)
            {
                c++;
            }
            }
        }
        System.out.println(c);
    }
}
