class Gadgets 
{
public static String[] Printgadgetsname(String names)
{
	if(names=="Gadnames")
	{
		System.out.println("gadgets names are:");
	
	
	
		String gad1="phone";
		String gad2="laptop";
		String gad3="lift";
		String gad4="fan";
		
	String[] Gadnames={gad1,gad2,gad3,gad4};
	
	
	return Gadnames;
	}
else{
	System.out.println("no match");
}	
	
return null;	
}
}