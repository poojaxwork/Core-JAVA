class Weapout
{
	public static void main(String[] rifle)
	{
		//1 ref
		Weapon obj1=new Weapon();
System.out.println(obj1.name+"\n"+obj1.cost+"\n"+obj1.model+"\n"+obj1.purpose+
		"\n"+obj1.type+"\n"+obj1.caliber);
		
		System.out.println("*************************");
		
		
		//2
		String wname="Mortar";
float  wcost=6999.78f;
int wmodel=1568;
String wpurpose="Rescue";
String wtype="Assault Rifle";
double wcaliber=0.003097;
Weapon obj2=new Weapon(wname,wcost,wmodel,wpurpose,wtype,wcaliber);
	System.out.println(wname+"\n"+wcost+"\n"+wmodel+"\n"+wpurpose+
		"\n"+wtype+"\n"+wcaliber);	
		
		
		
		System.out.println("*************************");
		//3
		String wpurp="War";
float  wcos=6999.78f;
int wmod=1568;
Weapon obj3=new Weapon(wpurp,wcos,wmod);
System.out.println(wpurp+"\n "+wcos+"\n "+wmod);



//4
System.out.println("*************************");
String wnames="AK 47";
String wtypo="RIFFLES";
String wpurpo="Defence";
double wcali=6868.68069f;
Weapon obj4=new Weapon(wnames,wtypo,wpurpo,wcali);
System.out.println(obj4.name+"\n "+obj4.type+" \n"+obj4.purpose+"\n "+obj4.caliber);
System.out.println("*************************");
//5
String weaname="Gun";
String weatype="Mortar";
String weapurpose="Security";
double potential=39399.4040400;
float costp=55050.404f;
Weapon obj5=new Weapon(weaname,weatype,weapurpose,potential,costp);
System.out.println( obj5.name+" "+obj5.type+" "+obj5.purpose+" "+obj5.caliber+
" "+ obj5.cost);
System.out.println("*************************");
//6
float priceofweapon=5000.5657f;
Weapon obj6=new Weapon(priceofweapon);
System.out.println(priceofweapon);
System.out.println("*************************");
//7
Weapon obj7=new Weapon();
System.out.println("object 7 is created");
System.out.println(obj7.name);
System.out.println("***************");
//8
float pricew=222.00982f;
Weapon obj8=new Weapon(pricew);
System.out.println("object 8 is created");
System.out.println(pricew);
System.out.println("***************");
//9
Weapon obj9=new Weapon();
System.out.println("object 9 is created");
System.out.println(obj9.cost);
System.out.println("***************");
//10
Weapon obj10=new Weapon();
System.out.println("object 10 is created");
System.out.println(obj10.caliber);









}
	
}
