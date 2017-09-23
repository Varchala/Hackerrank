import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max=-63,c=0,sum=0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            sum=0;
            for(int j=c;j<c+3;j++)
            {
                sum=sum+arr[i][j];
                if(j==c) sum=sum+arr[i+1][j+1];
                sum=sum+arr[i+2][j];
            }
            c=(c<3)?c+1:0;
            if(sum>max)
            {
                max=sum; 
            }
            if(c!=0)i--;
        }
        System.out.println(max);
    }
}
