class PersonRunner
{
	public static void  main(String[] identity)
	{
		boolean gender= Person.identity('M',21);
		System.out.println("gender  :"+gender);
		
		
		String religion=Person.identity("hindu");
		System.out.println("religion  :"+religion);
		
		
	String name=Person.identity(505893045840L);
		System.out.println("name  :"+name);
		
		int city=Person.identity(80);
		System.out.println("total distance :"+city);
		
		return;
	}
}