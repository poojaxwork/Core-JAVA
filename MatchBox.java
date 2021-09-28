class MatchBox
{
	String[] brand;
	int noOfsticks;
	boolean empty;
	Matchsize size;
	
	MatchBox()
	{
	System.out.println("No argument constructor is invoked");	
		
	}
	
	MatchBox(int noOfsticks)
	
	{
		
		if(noOfsticks>100)
		{
			System.out.println("Matches are present");
		}
		else
		{
		System.out.println("Matchbox is empty");
		}	
		
		String[] names={"Saftey Sticks","Cycle Brand","Black Stone","Agni"};
		this.brand=names;
		this.noOfsticks=noOfsticks;
		this.empty=empty;
		this.size=size;
		
	}
	
	
	
	
	
	
	
}