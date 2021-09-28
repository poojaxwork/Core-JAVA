class Spoonrunner
{
public static void main(String[] tuesday)//type quant price color
{
//new Spoon();
//1 instance
Spoon spoonref=new Spoon();
spoonref.type="Stinless steel";
 String typ=spoonref.type;
System.out.println(typ);
spoonref.price=100;
System.out.println(spoonref.price);
spoonref.color="blue";
System.out.println(spoonref.color);
spoonref.quantity=10;
System.out.println(spoonref.quantity);

//2 instance
Spoon insta1=new Spoon();
 insta1.type="plastic";
System.out.println(insta1.type);
insta1.quantity=10;
System.out.println(insta1.quantity);
insta1.price=100.2f;
System.out.println(insta1.price);
insta1.color="red";
System.out.println(insta1.color);

//inta 3
Spoon insta2=new Spoon();
insta2.type="silver";
insta2.price=300;
insta2.color="black";
insta2.quantity=20;
System.out.println(insta2.type+"\n "+insta2.price+" \n"+insta2.color+" "+insta2.quantity);
//inta 4
Spoon insta3=new Spoon();
insta3.type="gold";
insta3.price=30;
insta3.color="navy blue";
insta3.quantity=202;
System.out.println(insta3.type+"\n "+insta3.price+" \n"+insta3.color+" "+insta3.quantity);

//inta 3


//inta 4
Spoon insta4=new Spoon();
insta4.type="gold";
insta4.price=300;
insta4.color="black";
insta4.quantity=20;
System.out.println(insta4.type+"\n "+insta4.price+" \n"+insta4.color+" "+insta4.quantity);
}
}