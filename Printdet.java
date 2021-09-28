class Printdet
{
public static void main(String[] pri)
//public static float getmob(String brand, String color,int model,
//float price,int quant, float imei,String country)
{
	System.out.println("enter the details of mobile:");
String brand=pri[0];
String color=pri[1];
int model=Integer.parseInt(pri[2]);
System.out.println(model);
float price=Float.parseFloat(pri[3]);
System.out.println(price);
int quant=Integer.parseInt(pri[4]);
System.out.println(quant);
float imei=Float.parseFloat(pri[5]);
System.out.println(imei);
String country=pri[6];
float Grandtotal=Mobdetails.getmob(brand,color,model,price,quant,imei,country);
System.out.println("Grandtotal:"+Grandtotal);
//System.out.println(Grandtotal);







}
}