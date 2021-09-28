
//String to primitive
class Convert{
public static void main(String[] val)
{
String p="10";
int wrapp=Integer.parseInt(p);
System.out.println(wrapp);

String o="20";
byte wrapo=Byte.parseByte(o);
System.out.println(wrapo);

String j="30";
long wrapj=Long.parseLong(j);
System.out.println(wrapj);

String b="40";
short wrapb=Short.parseShort(b);
System.out.println(wrapb);

String c="10.98";
float wrapc=Float.parseFloat(c);
System.out.println(wrapc);

String a="10.92";
double wrapa=Double.parseDouble(a);
System.out.println(wrapa);

String d="10";
char wrapd=d.charAt(0);
System.out.println(wrapd);

String e="88=0";
boolean wrape=Boolean.parseBoolean(e);
System.out.println(wrape);

















}
}
