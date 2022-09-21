class SateliteRunner
{
	public static void main (String[] vikram)
	{
		System.out.println("static method ");
	Satelite.navigation();// calling(revoke) from the static method
	
	Satelite.gps();
	Satelite.navigation();
	Satelite.communication();
	Satelite.wetherForecasting();
	Satelite.survelence();
	Satelite.monitering();
	Satelite.defence();
	Satelite.televisionSignal();
	System.out.println("static variable method"+Satelite.ref);
	}	
	
}