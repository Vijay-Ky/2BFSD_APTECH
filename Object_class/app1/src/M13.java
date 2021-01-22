class E
{
	int i;
	int j;
	double k;

	E(int i, int j, double k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public boolean equals(Object obj)
	{
		E ref = (E)obj;
		boolean flag = (i == ref.i && j == ref.j && k == ref.k);
		return flag;
	}
}
class M13 
{
	public static void main(String[] args) 
	{
		E e1 = new E(10, 20, 5.5);
		E e2 = new E(10, 20, 5.5);
		E e3 = new E(10, 20, 5.4);
		System.out.println(e1.equals(e2));//true
		System.out.println(e1.equals(e3));//false
		System.out.println(e2.equals(e3));//false
	}
}
