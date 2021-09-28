//5 prop,9 overloaded,10 obj

class Festival
{
String festname;
String type;
int month;
String fest;
String msg;
Festival()
{
	
	System.out.println("No argument constructor is initialized");
}

Festival(String festname,String type,int month,String fest,String msg)
{
	System.out.println("parameterized constructor is initialized");
	this.festname=festname;
	this.type=type;
	this.month=month;
	this.fest=fest;
	this.msg=msg;
	
}
//3
Festival(String festname,String type,int month,String fest)
{
	System.out.println("parameterized constructor is initialized");
	this.festname=festname;
	this.type=type;
	this.month=month;
	this.fest=fest;
	}
//4
Festival(String festname,String type,int month)
{
	System.out.println("parameterized constructor is initialized");
	this.festname=festname;
	this.type=type;
	this.month=month;
}
//5
Festival(String festname,String type)
{
	System.out.println("parameterized constructor is initialized");
	this.festname=festname;
	this.type=type;
}
//6
Festival(String festname)
{
System.out.println("parameterized constructor is initialized");
	this.festname=festname;	
	
}
//7
Festival(int month,String fest)
{
System.out.println("parameterized constructor is initialized");	
this.month=month;
	this.fest=fest;	
}
//8
Festival(String type,int month)
{System.out.println("parameterized constructor is initialized");	
this.type=type;
	this.month=month;

}
//9
Festival(String type,int month,String fest)
{
	System.out.println("parameterized constructor is initialized");
	this.type=type;
	this.month=month;
	this.fest=fest;
	
}


}