class Devtester
{
public static void main(String[] values)
{
//1 instance
Developers tes1=new Developers();
tes1.name="pooja";
tes1.age=21;
tes1.designation="Java full stack developer";
System.out.println(tes1.name+" "+tes1.age+" "+tes1.designation);

//2 instance
Developers inst2=new Developers();
inst2.name="pallavi";
inst2.age=31;
inst2.designation="Associate engineer";
System.out.println(inst2.name+" "+inst2.age+" "+inst2.designation);
//3 instance
Developers tes2=new Developers();
tes2.name="prithvi";
tes2.age=21;
tes2.designation="project engineer";
System.out.println(tes2.name+" "+tes2.age+" "+tes2.designation);

//4 instance
Developers inst3=new Developers();
inst3.name="pavithra";
inst3.age=41;
inst3.designation="web developer";
System.out.println(inst3.name+" "+inst3.age+" "+inst3.designation);
//5 instance
Developers tes3=new Developers();
tes3.name="purvi";
tes3.age=21;
tes3.designation=" System engineer";
System.out.println(tes3.name+" "+tes3.age+" "+tes3.designation);



}
}