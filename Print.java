class Print
{
public static void main(String[] p)
{

int value=91;
String code=Country.Getcountrynamebycode(value);
System.out.println(code);
int pin=10;
String cityname=City.printcity(pin);
System.out.println(cityname);
}
}