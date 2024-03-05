import java.io.Console;  
class complex1
{    
public static void main(String args[]){    
Console c=System.console();    
System.out.println("Enter complex numbers: ");    
   
}    
}  
public class complex
{
	int r,i;
complex(int real,int img)
{
	r=real;
	i=img;
}
	void display()
{
System.out.println(r+"+"+i+"i");
}
static void add(int r1,int i1,int r2,int i2)
{
	r1=r1+r2;
	i1=i1+i2;
	System.out.println("after addition="+r1+"+"+i1+"i");
}
public static void main(String[]args)
{
	
	System.out.println("complex numbers are=");
	first.display();
	second.display();
	add(first.r,first.i,second.r,second.i);
}
}

