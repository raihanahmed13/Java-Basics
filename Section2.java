//Type casting
class Section2
{
	public static void main(String args[])
	{
		//widening casting
		System.out.println("Wedening Type casting");
		int a = 5;
		float fl = a;
		double b = a;
		char c = 'a';
		int h = c;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("h= "+h);
		System.out.println("fl= "+fl);
		
		//Narrowing casting
		System.out.println("Narrowing Type casting");
		float f = 65.005f;
		int i = (int)f;
		int g = 65;
		char ch = (char)g;
		System.out.println("f= "+f);
		System.out.println("i= "+i);
		System.out.println("g= "+g);
		System.out.println("ch= "+ch);
		ch = (char)f;
		System.out.println("ch= "+ch);
		
	}
}
