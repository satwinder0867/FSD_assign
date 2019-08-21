class OddNum{
	public static void main(String[] args) {
		System.out.println("Odd Number between 35-86 :");
		int num=35,max=86;
		while(num<max)
		{
			if(num%2!=0)
				System.out.print(num+" ");
			num++;
		}			
	}
}