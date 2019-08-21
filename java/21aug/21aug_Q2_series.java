class Series{
	public static void main(String[] args) {
		for(int i=35;i<=46;i++)
		{
			if(i==38){
				System.out.println("Thirty Eight");
				continue;
			}
			if(i==40 || i==43){
				continue;
			}
			if(i==45){
				System.out.println("Fourty Five");
				continue;
			}
			System.out.println(i);
		}
	}
}