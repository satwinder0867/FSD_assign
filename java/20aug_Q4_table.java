class Table{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int i=1,product=1;
		while(i<=10)
		{	
			product=num*i;
			System.out.println(num+" * "+i+" = "+product);
			i++;
		}
	}
}