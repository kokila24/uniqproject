class Hero //Encapsulation
{
private int rollno;
private String name;
void set(int rollno1)
{
rollno=rollno1;
}
void seta(String name1)
{
name=name1;
}
int get()
{
return rollno;
}
String geta()
{
return name;
}
public static void main(String args[])
{
Hero obj=new Hero();
obj.set( 12);
obj.seta("kokila");
System.out.println(obj.get());
System.out.println(obj.geta());
}
}


