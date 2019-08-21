import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Series : ");
		int []arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.print("Series : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+"  ");
		}

		// int min=arr[0];

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i-1;j++)
				{
					if(arr[j]>arr[j+1])
					{	
						int temp;
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
				
		}

		System.out.println("");
		System.out.print("Sorted Series : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}