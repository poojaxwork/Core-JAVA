class Productdetails
{
public static void printnames(String product,int quant,String address)
{
System.out.println(product);
System.out.println(quant);
System.out.println(address);

}


public static float getTotalprice(String name,int quant,float price)
{
System.out.println("get total price");
System.out.println("quantity name:"+name);
System.out.println("quantity:"+quant);
System.out.println("price:"+price);
float total=quant*price;
return total;
}
}