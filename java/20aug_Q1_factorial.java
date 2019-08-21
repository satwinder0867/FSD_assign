class Factorial{
	public static void main(String[] args) {
		int fact=1;
		int num=Integer.parseInt(args[0]);
		for(int i=1;i<=num;++i)
		{
			fact*=i;
		}
		System.out.println("Factorial of a number : "+fact );
	}
}
