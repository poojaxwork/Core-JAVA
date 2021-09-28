class Samosarunner
{
public static void main(String[] food)
{
	float cost=30.33f;
	boolean taste=false;
Samosa sam=new Samosa(cost,taste);
System.out.println(sam.ingredients);
System.out.println(sam.price);
System.out.println(sam.size);
System.out.println(sam.taste);

String[] requirements={"potato","onion","oil","flour"};
Samosa samosa1=new Samosa(requirements,30.3f,Samosasize.SMALL,true);
System.out.println(samosa1.ingredients[0]);
System.out.println(samosa1.price);
System.out.println(samosa1.size);
System.out.println(samosa1.taste);







}



}