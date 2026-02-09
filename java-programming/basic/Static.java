	public class Static
		{
	static  float a;
	int b;
	static void display()
	{
		System.out.println("STATIC METHOD");
	}
		void display()
	{
		System.out.println("INSTANCE METHOD");
	}
	static
	{
		System.out.println("STATIC BLOCK**");
	}
		public static void main(String[] agrs)
		{
			display();
			obj.display();
		}

}
