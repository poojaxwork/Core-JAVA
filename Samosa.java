class Samosa
{
	String[] ingredients;
float price;
Samosasize size;
boolean taste;
Samosa(float price,boolean taste)
{
	System.out.println("Parameter const is invoked:");
	this.price=price;
	this.taste=taste;
	}	

Samosa(String[] ingredients,Samosasize size)
{
	System.out.println("Parameter cont is invoked");
	this.ingredients=ingredients;
	this.size=size;
	}		
	
	Samosa(String[] ingredients,float price,Samosasize size,boolean taste)
	{
		this(price,taste);
		this.ingredients=ingredients;
	this.size=size;
	}	
		
	
}










