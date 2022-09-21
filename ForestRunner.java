class ForestRunner{
	public static void main(String[] vikram)
	{
		System.out.println("properties of the kuduremuk forest");
		System.out.println(Forest.totalAreaINMeter);
		System.out.println(Forest.type);
		System.out.println(Forest.region);
		System.out.println(Forest.primaryAnimals);
		System.out.println(Forest.name);
		for(int index=0;index<Forest.primaryAnimals.length;index++)
		{
			String ref=Forest.primaryAnimals[index];
			System.out.println("primaryAnimals"+ref);
		}
		Forest.primaryAnimals[0]="horse";
		Forest.primaryAnimals[2]="monkey";
		for(int indexs=0;indexs<Forest.primaryAnimals.length;indexs++)
		{
			String ref1=Forest.primaryAnimals[indexs];
			System.out.println("new animals  "+ref1);
			
		}
		
		
		
}}
