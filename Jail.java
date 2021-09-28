class Jail
{
String location;
String name;
int noOfcells;
int noOfprisoners;
int staffs;
int establishedyear;
float areaInacres;
boolean strict;

Jail(String location,String name,int establishedyear,float areaInacres)
{
	System.out.println("parameter constructor is initialized");
	this.location=location;
 this.name=name;
 this.noOfcells=100;
 this.noOfprisoners=100;
 this.staffs=50;
 this.establishedyear=establishedyear;
 this.areaInacres=areaInacres;
	
	
	
	
}

}