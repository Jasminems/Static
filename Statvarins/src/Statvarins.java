/*A Java program to print static variable in Instance Method*/
public class Statvarins 
{
	static int a=10;					//Static variable
	void print()						//Instance Method
	{
		System.out.println("The Static variable is:"+a);//Printing static variable in instance method
	}
	public static void main(String[] args) 
	{
		Statvarins s=new Statvarins();
		s.print();
	}

}
