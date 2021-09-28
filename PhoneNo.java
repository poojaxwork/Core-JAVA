class PhoneNo{
	public static void main(String[] values)
	{
		long p1=123457890;
		long p2=123457890;
		long p3=123457890;
		long p4=123457890;
		long[] printph={p1,p2,p3,p4,9880568275l};
		printph[0]=9876543321l;
		System.out.println(printph[0]);
		System.out.println(printph.length);
	}
	
}