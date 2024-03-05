class Box
{
double width;
double height;
double depth;
void volume()
{
System.out.println("volume="+width*height*depth);
}
}
class volumefrst
{
public static void main(String args[])
{
Box boxobj=new Box();
boxobj.width=10;
boxobj.height=20;
boxobj.depth=30;
boxobj.volume();
}
}

