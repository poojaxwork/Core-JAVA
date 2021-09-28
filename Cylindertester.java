class Cylindertester
{
public static void main(String[] job)
{
	float cost=899.59f;
GasCylinder obj=new GasCylinder(cost);
//System.out.println(obj.company);	
//System.out.println(obj.size);		
System.out.println(obj.price);		
System.out.println(obj.weight);	
System.out.println(obj.CylinderNo);	
obj.company=CylinderCompany.HP;
	System.out.println(obj.company);
	obj.size=Cylindersize.LARGE;
	System.out.println(obj.size);
}

}