class Gettotal
{
public static void main(String[] tab)
{
//(String name,String company,float price,int quantity)
//String name=pooja[0];
//int quant=Integer.parseInt(pooja[1]);
//System.out.println(quant);
//float price=Float.parseFloat(pooja[2]);
//System.out.println(price);
//float total=Productdetails.getTotalprice(name,quant,price);
//System.out.println("total price:"+total);
String name=tab[0];
String company=tab[1];
float price=Float.parseFloat(tab[2]);
System.out.println(price);
int quantity=Integer.parseInt(tab[3]);
System.out.println(quantity);
float total=Tabnames.details(name,company,price,quantity);
System.out.println("TOTAL:"+total);



}
}