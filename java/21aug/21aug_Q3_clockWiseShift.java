import java.util.Scanner;
class ClockWiseShift{
	public static void main(String[] args) {
		// System.out.print("Enter the series length : ");
		// Scanner sc=new Scanner(System.in);
		// int size=5;
		// System.out.print("Enter the series :\n ");
		// int [] arr=new int[size];
		// for(int i=0;i<size;i++)
		// 	arr[size]=sc.nextInt();

		// for(int i=0;i<size;i++)
		// 		System.out.print(arr[i]+"  ");

		// int [] arr={1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter series : ");
		int [] arr= new int[5];
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Seires is : ");
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println("");
		int temp=arr[4];

		// System.out.print(arr[4]+"  ");
		// for(int i=1;i<5;i++)
		// {
		// 	System.out.print(arr[i-1]+"  ");
		// }
		for(int i=4;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.print("\n Sorted list : ");
		for(int i=0;i<5;i++)
		{
		 	System.out.print(arr[i]+"  ");
		}

	}
}