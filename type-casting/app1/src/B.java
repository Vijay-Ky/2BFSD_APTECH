class B 
{
	public static void main(String[] args) 
	{
		double d1 = 10.88;
		double d2 = test((int)(short)(byte)d1);
		System.out.println(d1);
		System.out.println(d2);
	}
	public static double test(int i)
	{
		return i;
	}
}
