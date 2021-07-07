/*A Java program to call Instance Method in Static Method*/
public class Statmetins 
{
	void inst()							//Instance Method
	{
		System.out.println("Hello");
	}
	static void print() 				//Static Method
	{
		inst();							//Calling instance method in static method-compile time error
	}
	public static void main(String[] args)
	{
		Statmetins s=new Statmetins();
		s.inst();
		s.print();

	}

}
