class Para
{
String name;
String place;
int weight;
Para(String nam,String pla,int weig)
{
name=nam;
place=pla;
weight=weig;
System.out.println("Constructor is invoked");

}
}
class Ram
{
public static void main(String[] gube)
{
String name="Prithvi";
String place="tumkur";
int weigh=10;
Para ref=new Para(name,place,weigh);
System.out.println(ref.name+" "+ref.place+ref.weigh);

}
}


