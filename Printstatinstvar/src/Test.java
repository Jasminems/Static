/*A Java program to print static and instance variables*/
class Test
{
	static int a=10;
	public static void main(String[] args) 
	{
		//static int a=10;
		int b=20;
		System.out.println("Static variable:"+a);
		System.out.println("Instance variable:"+b);
	}
}