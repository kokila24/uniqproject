class A
{
 int a=10;
}
class B
{
 int b=20;
}
class C
{
public static void main(String args[])
{
A obj=new A();
B obj1=new B();
int d=obj.a+obj1.b;
System.out.println("The addition of two numbers:"+d);
}
}
