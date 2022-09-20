class Card
{    static String type;
	static byte height;
	static float width;
	static int price;
	static String[] colours;
	public static void displayDetails()
	{
		System.out.println ("type  :"+type);
		System.out.println( "height  :"+height);
		System.out.println("width  :"+width);
		System.out.println("price  :"+price);
		if(colours!=null)
		{
			for(int index=0;index<colours.length;index++)
			{
				System.out.println("reference is not pointing to null");
				String ref=colours[index];
				System.out.println("colour of card :"+ref);
			}
		}
		else
		{
			System.out.println("reference is pointing to null");
		}
		
	}
}