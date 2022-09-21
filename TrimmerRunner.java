class TrimmerRunner
{
	public static void main(String[] vikram)
	{
		System.out.println("properties of trimmer");
		System.out.println("brand of trimmer--"+Trimmer.brand);
		System.out.println("price of trimmer----"+Trimmer.price);
		System.out.println("colour of Trimmer----"+Trimmer.colour);
		System.out.println("trimmeris working-----"+Trimmer.working);
		System.out.println("warrenty------"+Trimmer.warrenty);
		System.out.println(Trimmer.totalSettings);
		
		
		for(int index=0;index<Trimmer.totalSettings.length;index++)
		{
		int ref=Trimmer.totalSettings[index];
		System.out.println("settings available--"+ref);}
		{
			System.out.println("settin at array 2---"+Trimmer.totalSettings[2]);
		}
		Trimmer.totalSettings[0]=12;
		Trimmer.totalSettings[1]=34;
		for(int indexs=0;indexs<Trimmer.totalSettings.length;indexs++)
		{
			int ref1=Trimmer.totalSettings[indexs];
System.out.println("new settings available"+ref1);
		}
	
		
		
	}
}