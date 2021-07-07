/*A Java program to call static and Instance method*/
class Meth
{
	void display()
	{
		System.out.println("Instance Method");
	}
	static void show()
	{
		System.out.println("Static Method");
	}
}
public class Calstainsmet
	{
		public static void main(String[] args) 
		{
			Meth m=new Meth();
			m.display();
			m.show();
		}
}
