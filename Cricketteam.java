//4 prop
//7 overloaded,10 obj

class Cricketteam
{
	String teamname;
	float  pitch;
	int noofplayers;
	String matchtype;
	Cricketteam()
	{
		System.out.println("No argument constructor is initialized");
		
	}
	
Cricketteam(String name,float pitch,int players,String type)
{
	System.out.println("parameter constructor is initialized with 4 parameter");
	teamname=name;
	this.pitch=pitch;
	noofplayers=players;
	matchtype=type;
}
Cricketteam(String name,float pitchlength,int players)
{
	System.out.println("parameter constructor is initialized with 3 parameter");
	teamname=name;
	pitch=pitchlength;
	noofplayers=players;
}
Cricketteam(String mtype,int players)
{
System.out.println("parameter constructor is initialized with 2 parameter");
matchtype=mtype;
noofplayers=players;	
}	
Cricketteam(String matchfor)
{
	System.out.println("parameter constructor is initialized with 1 parameter");
	matchtype=matchfor;
	
}
Cricketteam(int player)	
{System.out.println("parameter constructor is initialized with 1 parameter");
	//this.teamname=teanames;
	//pitch=pitchlen;
	noofplayers=player;
	//matchtype=types;
}
	
	
}