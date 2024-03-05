class Box
{
double width;
double height;
double depth;
double volume()
{
return width*height*depth;
}
}
class volumebox
{
public static void main(String[]args)
{
Box box=new Box();
double vol;
box.width=10;
box.height=20;
box.depth=25;
vol=box.volume();
System.out.println("volume="+vol);
}
}

