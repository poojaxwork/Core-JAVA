class NewsTester
{
public static void main(String[] cabs)
{
	NewsPaper ref=new NewsPaper();
	System.out.println(ref.name="Vijay Karnataka");
	System.out.println(ref.ownerName="The times group");
      System.out.println(ref.language.KANNADA);
	System.out.println(ref.cost.PRAJAVANI.cost);
	System.out.println(ref.type.DAILY);
	System.out.println(ref.editor="Hariprakash");
	
System.out.println("*************");
String name="Times Now";
String owner="Network 18";
//String editorname="John Witherow";
NewsPaper ref1=new NewsPaper(name,owner,Lang.ENGLISH);
	System.out.println(ref1.name);
	System.out.println(ref1.ownerName);
      System.out.println(ref1.language.ENGLISH);
	System.out.println(ref1.cost.TIMESNOW.cost);
	System.out.println(ref1.type.DAILY);
	System.out.println(ref1.editor="John Witherow");

System.out.println("*************");
NewsPaper ref3=new NewsPaper(Type.WEEKLY,Price.DECCANHERALD,Lang.ENGLISH);
	System.out.println(ref3.name="Deccan Herald");
	System.out.println(ref3.ownerName="Nettakallappa family");
      System.out.println(ref3.language);
	System.out.println(ref3.cost.DECCANHERALD.cost);
	System.out.println(ref3.type);
	System.out.println(ref3.editor="Sitaraman Shankar");
	
	
	System.out.println("*************");
NewsPaper ref4=new NewsPaper(Type.MONTHLY,Price.BENGALSAMACHAR,Lang.HINDI);
	System.out.println(ref4.name="Bengal Samachar");
	System.out.println(ref4.ownerName="Baptist Missionary");
      System.out.println(ref4.language);
	System.out.println(ref4.cost.BENGALSAMACHAR.cost);
	System.out.println(ref4.type);
	System.out.println(ref4.editor="John Clark");
	
	
	System.out.println("*************");
NewsPaper ref5=new NewsPaper(Type.DAILY,Price.PRAJAVANI,Lang.KANNADA);
	System.out.println(ref5.name="PRAJAVANI");
	System.out.println(ref5.ownerName="Nettakallappa family");
      System.out.println(ref5.language);
	System.out.println(ref5.cost.PRAJAVANI.cost);
	System.out.println(ref5.type);
	System.out.println(ref5.editor="Sitaraman Shankar");


}
}