class GraduateRunner
{
	public static void main(String[] vikram)
	{
		System.out.println("college start aythu");
		
		
		Graduate.saveName("dharshan",true);
		Graduate.saveName("sunil",false);
		Graduate.saveName("mani",true);
		
	String talk=Graduate.displayDetails();
		
		
		System.out.println("talk  :"+talk);
		
		System.out.println("college ends");
		
		
		
	}
}