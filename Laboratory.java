class Laboratory
{
	String name;
	String location;
	String[] operators;
	int noOfrooms;
	Labtype type;
	
	
	
	Laboratory()
	{
		
		System.out.println("Const is invoked");
		
	}
	Laboratory(String name,String location,int noOfrooms)
	{
		this.name=name;
		this.location=location;
		String[] ops={"acids","bases","testtubes"};
		this.operators=ops;
		this.noOfrooms=noOfrooms;

		
		
	}
	
}
//Samosasize(String[] ingredients,Samosasize size;)
{
	System.out.println("Parameter cont is invoked");
	this.price=price;
	this.taste=taste;
	}		
	
	Samosa(float price,boolean taste)
	{
		this(price,taste);
	}	
		
	
}