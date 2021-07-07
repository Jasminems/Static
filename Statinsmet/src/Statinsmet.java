/*A Java program to call static method in instance method*/
public class Statinsmet 
{
	static void print()					//Static Method
	{
		System.out.println("Static Methods are called in instance method");
	}
	void inst() 						//Instance Method
	{
		print();		//Calling static method in instance method
	}
	public static void main(String[] args)
	{
		Statinsmet s=new Statinsmet();
		s.inst();
		//s.print();

	}

}