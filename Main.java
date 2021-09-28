class Main
{
public static void main(String[] values)
{
	Printer.printname();
	String Company=Printer.printname("INFOSYS");
	Printer.printcompany();
	String name=Printer.printcompany("");
	Printer.printcompbrand();
	String brand=Printer.printcompbrand("");
	String[] brands={"SAMSUNG","POCO","i phone","MI"};

	
	String FB=Printer.printmobbrands(brands);
	System.out.println(FB);
	Printer.printteam();
	String LT=Printer.printteam("");
	String[] Iplteams={"MI","RCB","DC","CSK","RR"};
	System.out.println(LT);
}
}