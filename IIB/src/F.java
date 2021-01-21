class F 
{
	{
		System.out.println("IIB-1");
	}
	F(int i)
	{
		this();
		System.out.println("F(int)");
	}
	F()
	{
		System.out.println("F()");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("----------");
		F f2 = new F(10);
		System.out.println("----------");
	}
}
