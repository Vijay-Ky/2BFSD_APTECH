class H
{
	{
		System.out.println("IIB-1");
	}
	static
	{
		System.out.println("SIB-1");
	}

	H()
	{
		System.out.println("H()");
	}

	{
		System.out.println("IIB-2");
	}

	public static void main(String[] args)
	{
		H h1 = new H();
		System.out.println("----------");
		H h2 = new H();
		System.out.println("----------");
		H h3 = new H();
		System.out.println("----------");
	}

	static
	{
		System.out.println("SIB-2");
	}

	{
		System.out.println("IIB-3");
	}
}
