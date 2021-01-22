class A
{
	int i;
	public String toString()
	{
		return "its a type object with i value as :" + i;
	}
}
class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 20;
		System.out.println(a1);
		String s1 = "desc: " + a1;
		System.out.println(s1);
	}
}
