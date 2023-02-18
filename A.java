/*class A
{
int a=10;
public void add()
{
sub();
System.out.println(a);
}
public void sub()
{
a=20;
System.out.println(a);
}
public static void main(String args[])
{
A obj=new A();
obj.add();
}
}
*/

class A
{
int a=10;
public void add()
{

System.out.println(a);
sub();

}
public void sub()
{
a=20;
System.out.println(a);
}
public static void main(String args[])
{
A obj=new A();
obj.add();
}
}
