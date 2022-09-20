class CardRunnner
{
	public static void main(String[] det)
	{
		System.out.println("start");
		Card.displayDetails();
		Card.type="rupay";
		Card.height=20;
		Card.width=10;
		Card.price=200;
		String[] colours={"blue","skyblue","dark blue"};
		Card.colours=colours;
		
		Card.displayDetails();
		System.out.println("end");
	}
}