class Vtester
{
public static void main(String[] pp)
{
  Vechiles prop =new Vechiles();//class name ref-name=new cls-name();
  String f1=prop.name;
System.out.println(f1);
float f2=prop.price;
System.out.println(f2);
String col=prop.color;
System.out.println(col);

Vechiles req=new Vechiles();
String pri=req.name;
System.out.println(pri);
}
}