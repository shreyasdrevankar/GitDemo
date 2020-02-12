package Tree;

public class Calci {

	public static void main(String[] args)
	{
		Calculator cl=new Calculator(){
			public void add(int a, int b)
			{
				System.out.println(a+b);}
			
			public void Sub(int a,int b)
			{
				System.out.println(a-b);}
			
			public void mul(int a,int b)
			{
				System.out.println(a*b);
			}
			public void div(int a,int b)
			{System.out.println(a/b);};
		};
		cl.mul(10, 5);
		cl.Sub(200,50);
		cl.add(20, 5);
		cl.div(50, 10);
	}
}
