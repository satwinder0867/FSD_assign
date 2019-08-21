import java.util.Scanner;
class SelectionSort{
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

		for(int i=0;i<4;i++)
		{
			int min=i;
			for(int j=i+1;j<5;j++)
				{
					if(arr[j]<arr[min])
					{	
						min=j;
					}
				}
				int temp;
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
		}

		System.out.println("");
		System.out.print("Sorted Series : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}