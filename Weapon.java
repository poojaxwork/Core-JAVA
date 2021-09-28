//6 prop,6 overloaded const,10 objec


class Weapon
{
String name;
float  cost;
int model;
String purpose;
String type;
double caliber;

Weapon()
{
System.out.println("Default constructor is invoked");
}
Weapon(String name,float cost,int model,String purpose,String type,double caliber)
{


System.out.println("parameter constructor is invoked");
this.cost=cost;
this.model=model;
this.purpose=purpose;
this.type=type;
this.caliber=caliber;
}

Weapon(String purpose,float cost,int model)
{
	System.out.println("parameter constructor is invoked(3 parameter) ");
this.cost=cost;
this.model=model;
this.purpose=purpose;
}

Weapon(String name,String purpose,String type,double caliber)
{
	
	System.out.println("parameter constructor is invoked(4 parameter) ");
this.name=name;
this.type=type;
this.purpose=purpose;
this.caliber=caliber;
	}
	
	Weapon(String name,String purpose,String type,double caliber,float price)
{
	
	System.out.println("parameter constructor is invoked(5 parameter) ");
this.name=name;
this.type=type;
this.purpose=purpose;
this.caliber=caliber;
this.cost=price;
	}
	Weapon(float costpri)
	{
		System.out.println("parameter constructor is invoked(1 parameter) ");
		this.cost=costpri;
		
	}
	
	
	
	
	
	
	
	
	
}