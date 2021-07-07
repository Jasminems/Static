/*Print the static variables and instance variables*/
public class Varinssta 
{
	static int v1;	//static variables
	int v4;				//instance variables
	void print()
	{
		System.out.println(+v1);
		System.out.println(+v4);
	}
	public static void main(String args[]) 
	{
		Varinssta ob=new Varinssta();
		ob.v1=10;
		ob.v4=20;
		ob.print();
	}
}