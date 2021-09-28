class Crictester
{
public static void main(String[] park)
{
Cricketteam ref=new Cricketteam();
System.out.println(ref.teamname+"\n "+ref.pitch+"\n "+ref.noofplayers+"\n "+
ref.matchtype);
System.out.println("***************");
//2 instance
String tname="INDIA";
float cpitch=25.5f;
int cplayers=11;
String mtype="One day";
Cricketteam ref1=new Cricketteam(tname,cpitch,cplayers,mtype);
System.out.println(ref1.teamname+"\n "+ref1.pitch+"\n "+ref1.noofplayers+"\n "+
ref1.matchtype);
System.out.println("***************");
//3 instance
String team="Australia";
float pitchlen=24.5f;
int playerreq=14;
Cricketteam ref3=new Cricketteam(team,pitchlen,playerreq);
System.out.println(ref3.teamname+"\n "+ref3.pitch+"\n "+ref3.noofplayers);
System.out.println("***************");
//4 instance
String matformat="ODI";
int playerno=13;
Cricketteam ref4=new Cricketteam(matformat,playerno);
System.out.println(ref4.noofplayers+" \n"+matformat);

//5 instance
System.out.println("***************");
String matchformat="World cup";
int playerslist=14;
Cricketteam ref5=new Cricketteam(matchformat,playerslist);
System.out.println(ref5.matchtype+"\n "+ref5.noofplayers);
//6 instance
System.out.println("***************");
String matchfom="Ipl";
Cricketteam obj6=new Cricketteam(matchfom);
System.out.println(matchfom);
//7 instance
System.out.println("***************");
//String nameofteam="South Africa";
//float lenofpitch=25.6f;
//int playersnum=16;
//String matchtyp="Test Series";
int playersnum=16;
Cricketteam obj7=new Cricketteam(playersnum);
System.out.println(playersnum);
//8 instance
System.out.println("***************");
String nameofteam="South Africa";
Cricketteam obj8=new Cricketteam(nameofteam);
System.out.println(nameofteam);
//9 instance
System.out.println("***************");

Cricketteam obj9=new Cricketteam();
System.out.println(obj9.teamname+"\n "+obj9.pitch+"\n "+obj9.noofplayers);
System.out.println("***************");
String cteam="Pakistan";
float len=344.488488f;
int playno=11;
Cricketteam ref10=new Cricketteam(cteam,len,playno);
System.out.println(ref10.teamname+"\n "+ref10.pitch+"\n "+ref10.noofplayers);
}
}