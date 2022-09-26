class TempleDataOperator
{
	
	static String[] names={"ram",null,null,null,null,null,null};
	static int income[]={0,0,0,0,0,0,0};
	
	static int position=0;
	
	static void saveData(String name,int value)
	
	{
	
	names[position]=name;
	income[position]=value;
	position++; 
	
	}
	
	static void displayNames()
	{
	for(int index=0;index<names.length;index++)
	{
		String ref=names[index];
		int ref1=income[index];
		System.out.println("name  :"+ref+ "&"+"income: "+ ref1+ " crore");
	}
	
	
	}
}