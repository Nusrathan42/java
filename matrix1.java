import java.util.Scanner;
class matrix
{
int m,n,i,j;
int[][]a=new int[5][5];
int[][]b=new int[5][5];
int[][]c=new int[5][5];
Scanner sc=new Scanner(System.in);
void get()
{
System.out.println("enter the no of rows:");
m=sc.nextint();
System.out.println("enter the no of columns:");
n=sc.nextint();
System.out.println("enter elements of matrix A");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextint();
System.out.println("enter elements of matrix B");
for(i=0;i<m;i++)
for(j=o;j<n;j++)
b[i][j]=sc.nextint();
}
void add()
{
for(i=0;i<m;i++);
for(j=0;j<n;j++);
c[i][j]=a[i][j]+b[i][j];
}
void display()
{
System.out.println("matrix A");
for(i=o;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(a[i][j]+" ");}
System.out.println();
}
System.out.println("matrix B");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
System.out.print(b[i][j]+" ");
}
System.out.println();
}
System.out.println("matrix C");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
public class matrix1
{
public static void main(String[]args)
{
matrix ob=new matrix();
ob.get();
ob.add();
ob.display();
}
}

