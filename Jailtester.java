class Jailtester
{
public static void main(String[] park)
{
String Location="Tumkur";
String Name="Tumkur Central jail";
//float areaInAcres=3.5f;
int establish=2000;
float areaInAcres=3.5f;


Jail insta=new Jail(Location,Name,establish,areaInAcres);

System.out.println(Location+" "+Name+" "+insta.noOfcells+" "+insta.noOfprisoners+" "+
insta.noOfprisoners+" "+insta.staffs+" "+establish+" "+areaInAcres);



}
}