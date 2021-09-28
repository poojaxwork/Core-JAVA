class Mobdetails
{
public static float getmob(String brand, String color,int model,
float price,int quant, float imei,String country)
{
System.out.println("Brand:"+brand);
System.out.println("Color:"+color);
System.out.println("Model"+model);
System.out.println("Amount:"+price);
System.out.println("Quant:"+quant);
System.out.println("Imei no:"+imei);
System.out.println("Country:"+country);
float Grandtotal=quant*price;
return Grandtotal;







}}