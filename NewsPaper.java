class NewsPaper
{
String name;
String ownerName;
Lang language;
Price cost;
Type type;
String editor;

NewsPaper()
{
System.out.println("Default constructor is invoked");	
	
	
}
NewsPaper(String name,String ownerName,Lang language)
{
this.name=name;
this.ownerName=ownerName;
this.language=language;
}

NewsPaper(Type type,Price cost,Lang language)
{
this.type=type;
this.cost=cost;
this.language=language;
}


}