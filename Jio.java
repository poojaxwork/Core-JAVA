class Jio{
public static void main(String[] pooja)

{
Productdetails.printnames("wheat",8,"xyxxxx");
System.out.println("===============");
String name=pooja[0];
int quant=Integer.parseInt(pooja[1]);
System.out.println(quant);
float price=Float.parseFloat(pooja[2]);
System.out.println(price);
float total=Productdetails.getTotalprice(name,quant,price);
System.out.println("total price:"+total);
}}