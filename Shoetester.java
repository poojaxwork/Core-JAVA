class Shoetester
{
public static void main(String[] puma)
{
Shoe read=new Shoe();
int s1=read.size;
System.out.println(s1);	
String s2=read.brand;
System.out.println(s2);	

//2 instances
Shoe read1=new Shoe();
read1.brand="adidas";
 String b1=read1.brand;
System.out.println(b1);	
}
}