import java.util.*;
public class matrix_addition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter the number of the rows");
        m=sc.nextInt();
        System.out.println("Enter the number of columns");
        n=sc.nextInt();
        int a[][]= new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("Enter the elemntsn of the first matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the resultant of the two matrix is ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(c[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}