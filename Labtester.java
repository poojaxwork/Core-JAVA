class Labtester
{
public static void main(String[] nature)
{
String name="JNNCE";
String	location="Shimoga";
int	rooms=2;
//String[] operators={"acids","bases","testtubes"};
Laboratory lab=new Laboratory(name,location,rooms);
System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.operators);
System.out.println(lab.operators[2]);
System.out.println(lab.noOfrooms);
 lab.type=Labtype.PHYSICS;
System.out.println(lab.type);
lab.type=Labtype.CHEMISTRY;
System.out.println(lab.type);
lab.location="Tumkur";
System.out.println(lab.location);




}
}