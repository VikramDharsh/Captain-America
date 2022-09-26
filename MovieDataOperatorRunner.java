class MovieDataOperatorRunner
{
	public static void main(String[] vikram)
	{
		System.out.println("movie start aythu");
		
		
		MovieDataOperator.saveName("bigil",200);
		MovieDataOperator.saveName("ponnjiyan selvan",400);
		MovieDataOperator.saveName("rrr",800);
		
		String talk =MovieDataOperator.displayDetails();
		
		
		
		System.out.println("movie end aythu");
		System.out.println("talk :"+talk);
		
		
	}
}