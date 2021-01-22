class B
{
	B(int i, double j)
	{
		this.i = i;
		this.j = j;
	}
}
class M10 
{
	public static void main(String[] args) 
	{
		B b1 = new B(10, 2.5);
		B b2 = new B(10, 2.5);
		
		B b3 = b2;

		System.out.println(b1 == b2);//false
		System.out.println(b1.equals(b2));//false
		//attribute by attribute compararing the content
		System.out.println(b1.i == b2.i && b1.j == b2.j);//true

		System.out.println(b2 == b3);//true
		System.out.println(b2.equals(b3));//true
		System.out.println(b2.i == b3.i && b2.j == b3.j);//true
	}
}

/*
skeleton of object class equals method
class Object
{
	public boolean equals(Object obj)
	{
		return (this == obj);
	}
}
*/