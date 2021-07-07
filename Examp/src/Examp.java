/*A Java program to print instance variables in static methods*/
class Examp
{
	int x=10;									//instance variable
	static void print() 						//static method
	{
		System.out.println(x);	//try to access instance variable-compile-time error
	}
	public static void main(String[] args)
	{
		Examp e = new Examp();
		//e.x=10;
		e.print();
	}
}