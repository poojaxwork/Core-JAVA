class Movie
{
public static String[] getactorsbymoviename(String moviename)
{

System.out.println("invoked getactorsbymoviename,args passed"+moviename);
if(moviename.equals("RRR"))
//if(movie=="RRR")
{
	System.out.println("RRR is matched");
	String hero="ttt";
	String heroin="rst";
	String villian="pqr";
String[] actors={hero,heroin,villian};
return actors;

}
else{
	System.out.println("Movie not found");
}

return null;
}
}