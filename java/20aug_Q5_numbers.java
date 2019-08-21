class Numbers{
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		if(num1>=40 && num2>=40 && num3>=40 && (num1+num2+num3)>=125) 
			System.out.println("Passing");
		else
			System.out.println("Failed");

	}
}