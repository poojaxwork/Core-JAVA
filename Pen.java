class Pen
{

Pen()
{
System.out.println("Default constructor is invoked");
}
void write()
{
	System.out.println("instance method is invoked:");
	
	this.drawing();//invoking static method by instance
}

static void drawing()
{
	
	System.out.println("Static method is invoked:");
	
}
 
 static void Scratch()
 {
	 System.out.println("Static method is invoked:");
	// this.write();//invoking instance method by static
	 
 }
 
void toy()
{
	
System.out.println("instance method is invoked:");
	this.write();//invoking instance method by other instance
	
}




}