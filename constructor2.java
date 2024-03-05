class employee
{
int eno;
String eName;
employee()
{
eno=10;
eName="minu";
}
void show()
{
System.out.println("\nemployee no:"+eno+"\nemployee Name:"+eName);
}
}
class constructor2
{
public static void main(String args[])
{
employee obj1=new employee();
obj1.show();
}
}
