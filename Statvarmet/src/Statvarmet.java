/*A Java program static,instance variables and methods*/
public class Statvarmet 
{
		//2Static variables
		  static int v1=10;
		  static String v2="Java";	
		  //2Instance variables
		  String v3="Testing";
		  int v4=20;	
		  //2Static Methods
		  static void disp1()
		  {
		      System.out.println("Var1 is: "+v1);
		  }
		  static void disp2()
		  {
		      System.out.println("Var2 is: "+v2);
		  }
		  //2Instance Methods
		  void print1()				
		  {
			  System.out.println("Var3 is:"+v3);
			  System.out.println("Var4 is:"+v4);
		  }
		  void print2()
		  {
			  disp1();
			  disp2();
		  }
		  public static void main(String args[]) 
		  {
			  Statvarmet ob=new Statvarmet();
		      disp1();
		      disp2();
		      //ob.print1();
		      ob.print2();
		      ob.print1();
		  }
}