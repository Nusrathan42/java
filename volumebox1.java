class Box
{
double width;
double height;
double depth;
double volume()
{
return width*height*depth;
}
void setDim(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
}
class volumebox1
{
public static void main(String[]args)
{
Box box=new Box();
double vol;
box.setDim(10,20,30);
vol=box.volume();
System.out.println("volume="+vol);
}
}

