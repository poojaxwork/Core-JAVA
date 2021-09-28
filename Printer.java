class Printer
{
	public static void printname()
	{
		System.out.println("Name:POOJA");
		System.out.println("fav vechile:FASCINO");
	
	}
	public static String printname(String company)
	{
		System.out.println( "dream company:"+company);
		return company;
	}

public static void printcompany()
{
System.out.println("TCS");
System.out.println("WIPRO");
System.out.println("MINDTREE");
System.out.println("INOSYS");
}
public static String printcompany(String name)
{
	System.out.println(name);
	return name;

}
public static void printcompbrand()
{
	
System.out.println("HP");
System.out.println("LEVONO");
System.out.println("DELL");
System.out.println("ACER");
}
public static String printcompbrand(String brand)
{
	System.out.println(brand);
	return brand;
}

public static String printmobbrands(String[] brands)
{

	System.out.println(brands[0]);
	System.out.println(brands[1]);
	System.out.println(brands[2]);
	System.out.println("firstbrand:" +brands[0]);
	return brands[0];
}

public static String printteam(String[] Iplteams)
{
	//string[] kgf={"ananth naag","yash","malvika avinash"};
	System.out.println(Iplteams[0]);
System.out.println(Iplteams[1]);
System.out.println(Iplteams[2]);
System.out.println(Iplteams[3]);
System.out.println(Iplteams[4]);
int lastteam= Iplteams.length-1;
String fav=Iplteams[lastteam];

return fav;
}
}






























































