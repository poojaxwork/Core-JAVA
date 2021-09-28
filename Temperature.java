class Temperature
{
public static String Printfeeling(float temp)
{
if(temp>10&&temp<20)
{
System.out.println("NORMAL");
return "Normal";
}
if(temp>20&&temp<30)
{
System.out.println("hot");
return "hot";
}
if(temp>30&&temp<40)
{
System.out.println("too hot");
return "too hot";
}
if(temp>40&&temp<60)
{
System.out.println("too cold");
return "too cold";
}
if(temp>60&&temp<70)
{
System.out.println("extreme hot");
return "extreme hot";
}
if(temp>70&&temp<20)
{
System.out.println("pleasant");
return "pleasant";
}

return"INVALID";














































































}

}