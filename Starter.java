class Starter{
	public static void main(String[] args)
	{
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		//System.out.println(args[2]);
		
		String moviename="RRR";
		String[] pqr=Movie.getactorsbymoviename(moviename);
		System.out.println(pqr);
		System.out.println(pqr[0]);
		System.out.println(pqr[1]);
		System.out.println(pqr[2]);
		
	}
}