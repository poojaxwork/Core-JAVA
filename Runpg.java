class Runpg{
public static void main(String[] gubegalu)
{
//Printer.Getdetails(gubegalu);
String name=gubegalu[0];
int quant=Integer.parseInt(gubegalu[1]);
//String wq=quant.parseInt(gubegalu[1]);
System.out.println(quant);
float price=Float.parseFloat(gubegalu[2]);
//String wp=price.parseFloat(gubegalu[2]);
System.out.println(price);
float total=Printer.Getdetails(name,quant,price);
System.out.println(total);



}}

class Printer
{
public static float Getdetails(String name,int quant,float price)
{
System.out.println("entered name is:"+name);
System.out.println("entered quant is:"+quant);
System.out.println("entered price is:"+price);
float total=quant*price;
return total;









}
}