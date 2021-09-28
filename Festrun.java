class Festrun
{
	public static void main(String[] args)
	{
		Festival ref=new Festival();
System.out.println(ref.festname+"\n "+ref.type+" \n"+ref.month+"\n "+
ref.fest+"\n"+ref.msg);

//2
System.out.println("***************");
String fesname="Ganesha chaturthi";
String typ="Regional festival";
int mon=9;
String fes="Ganesha";
String mssg="Unity";
Festival ref1=new Festival(fesname,typ,mon,fes,mssg);
System.out.println(ref1.festname+"\n "+ref1.type+" \n"+ref1.month+"\n "+
ref1.fest+"\n"+ref1.msg);

//3
System.out.println("***************");


Festival ref2=new Festival();
//4

System.out.println("***************");
String Festname="Deepavali";
String Type="Regional festival";
int Month=10;
String Fest="fetival of lights";

Festival ref4=new Festival(Festname,Type,Month,Fest);
System.out.println(Festname+"\n"+Type+"\n"+Month+"\n"+Fest);

//5
System.out.println("***************");
String festName="Republic Day";
String tyPe="National";
int moNth=01;
Festival ref5=new Festival(festName,tyPe,moNth);
System.out.println(ref5.festname+"\n "+ref5.type+" \n"+ref5.month);
//6

String fName="Onam";
String typo="Kerala";
System.out.println("***************");
Festival ref6=new Festival(fName,typo);
System.out.println(ref6.festname+"\n "+ref6.type);

//7
System.out.println("***************");
String FName="Ugadi";
Festival ref7=new Festival(FName);
System.out.println(FName);

//8

int fmonth=11;
String Fests="Dasara";
System.out.println("***************");
Festival ref8=new Festival(fmonth,Fests);
System.out.println(fmonth+"\n"+Fests);
//9
System.out.println("***************");
	String typeS="Gowri Festival";
	int MOnth=8;
Festival ref9=new Festival(typeS,MOnth);
System.out.println(typeS+"\n"+MOnth);
//10
System.out.println("***************");
	String typesOf="Regional fest";
	
Festival ref10=new Festival(typesOf);
System.out.println(typesOf+"\n"+ref10.msg);
	
	}
	
}