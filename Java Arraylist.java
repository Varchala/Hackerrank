import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int n,m,j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>(n);
        for(int i=0;i<n;i++)
        {
            m=s.nextInt();
            ArrayList<Integer> l=new ArrayList<Integer>(m);
            for(j=0;j<m;j++)
            {
                l.add(s.nextInt());
            }
            a.add(l);
        }
        j=s.nextInt();
        while(j!=0)
        {
            n=s.nextInt();
            m=s.nextInt();
            try{
                System.out.println(a.get(n-1).get(m-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
            j--;
        }
        
    }
}
