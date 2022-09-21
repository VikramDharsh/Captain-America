class Person //method over loading
{
	static boolean identity( char gender,int age)
	{
		System.out.println("enetered characersticks");
		System.out.println("gender  :"+gender+"    age  :"+age);
		if(gender=='M'&&age==21)
		{
		System.out.println("this dtails belong to me");
		return true;	
		}
		  return false;                                                         //different number of parameter
	}
	static String identity(String religion)
	{
	
		return "hindu";
	}
	static String identity(long adharNo)
	{
	System.out.println("adhar no  :"+adharNo);
	return "dharshan";
	} 


	
static int identity(int distance)
	{
		System.out.println("city distance from banglore  :"+distance);
	if(distance==80)
	{
		System.out.println("im from kolar");
		return 80;
		
	}
return 0;	
	
	}
	
}