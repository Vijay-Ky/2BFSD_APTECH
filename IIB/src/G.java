class G
{
	{
		System.out.println("IIB-1");
	}

	G(int i)
	{
		this();
		System.out.println("G(int)");
	}

	G()
	{
		System.out.println("G()");
	}

	{
		System.out.println("IIB-2");
	}

	public static void main(String[] args)
	{
		G g1 = new G(10);
		System.out.println("----------");
	}

	{
		System.out.println("IIB-3");
	}
}
