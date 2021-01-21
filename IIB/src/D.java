class D
{
	D()
	{
		System.out.println("D()");
	}

	{
		System.out.println("IIB-1");
	}

	{
		System.out.println("IIB-2");
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("---------------");
		D d2 = new D();
		System.out.println("---------------");
	}
}
