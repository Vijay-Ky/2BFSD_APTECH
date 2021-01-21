class A 
{
	static void test1()
	{
		System.out.println("from test1");
	}
	static void test1(int i)
	{
		System.out.println("from test1(int)");
	}
	static void test1(int i, int j)
	{
		System.out.println("from test1(int,int)");
	}

	public static void main(String[] args) 
	{
		A.test1();
		A.test1(90);
		A.test1(90, 100);
		System.out.println("done");
	}
}
