class Tyre
{
	static void transport()
	{
		System.out.println("tyre is used in vehicle wheels");
	}
	static void support()
	{
		System.out.println("tyre is used in support");
	}
	static void property()
	{
		System.out.println("tyre is made up off leather type material");
		
	}
	static void boat()
	{
		System.out.println("tyre is used in boats to reduce speed");
	}
	static void material()
	{
		System.out.println("ceat tyres are best");
		
	}
	static void ref(){ //accesing the static method in the same class
	Tyre.transport();
	boat();
	material();
	}
}