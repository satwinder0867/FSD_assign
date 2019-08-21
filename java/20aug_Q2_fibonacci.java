class Fibonacci{
	public static void main(String[] args) {
		int n1=0,n2=1,i=0,sum=0;
		System.out.print("Fibonacci series :\n");
		System.out.print(n1+"  "+n2);
		while(sum<89)
		{
			sum=n2+n1;
			System.out.print("  "+sum);
			n1=n2;
			n2=sum;
			// i=i+n3;
		}
	}
}
