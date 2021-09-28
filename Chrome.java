enum Foodprice
{
PURI(39.9f,5),IDLI(39.9f,5),DOSA(39.9f,5);
float price;
int gst;
Foodprice(float price,int gst)
{
this.price=price;
this.gst=gst;

}}
class Hotel
{
String name;
String[] menu;
Foodprice price;
int no;
Hotel(String name,int no)
{
this.name=name;
this.no=no;

}
Hotel(String name,String[] menu,Foodprice price,int no)
{
this(name,no);
this.menu=menu;
this.price=price;

}

}

class Runner
{
public static void main(String[] puri)
{
Hotel ref=new Hotel("VIDYARTHI BHAVAN",8);
System.out.println(ref.name);
System.out.println(ref.no);
System.out.println(ref.menu);
System.out.println(ref.price);



String[] menus={"puri","idli","dosa"};
Hotel ref1=new Hotel("VIDYARTHI BHAVAN",8,menus,Foodprice.PURI.price);
System.out.println(ref1.name);
System.out.println(ref1.no);
System.out.println(ref1.menu[1]);
System.out.println(ref1.price);



}
}


