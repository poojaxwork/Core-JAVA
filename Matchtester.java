class Matchtester
{
public static void main(String[] zoos)
{
	int sticks=50;
	
MatchBox obj=new MatchBox(sticks);
System.out.println(obj.brand[1]);
System.out.println(obj.noOfsticks);
System.out.println(obj.empty);
//System.out.println(obj.size);
//obj.size=Matchsize.11;
obj.size=Matchsize.SMALL;
}
}