package lambdaExpression;

public class LambdaExpression {

	public static void main(String[] args) {
		
		A obj;
		
		//UNANIMOUS INNER CLASS
		
//		obj=new A()
//				{
//					public void show()
//					{
//						System.out.println("Show in inner class");
//					}
//					public void eat()
//					{
//						System.out.println("Eating....");
//					}
//				};
//		obj.show();
//		obj.eat();
		
		obj=()->System.out.println("Show in lambda expression ");
		
		obj.show();
		

	}

}

interface A
{
	void show();
	//void eat();
}

//class for implementing methods for interface a
//class Abc implements A
//{
//	public void show()
//	{
//		System.out.println("Show ");
//	}
//}
