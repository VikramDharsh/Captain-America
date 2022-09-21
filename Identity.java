class Identity
{// syntax i.e static void methodname(delaration){}
	static void  printName( int student,String name,String email,int age,String address,String shirtSize,String pantSize,int weight,int  height)
	{ 
	//reference
//System.out.println("identity using parameters");
    System.out.println("student--"+student);
	System.out.println("name-"+name);
	System.out.println("email--"+email);
	System.out.println( "age--"+age);
	System.out.println("address--"+address);
	System.out.println("shirtSize--"+shirtSize);
	System.out.println("pantSize--"+pantSize);
	System.out.println("weight--"+weight);
	System.out.println("height--"+height);
	int ram=122;
	
	System.out.println(ram);
}
static void nameAndEmail(String name,String email)
{
	System.out.println("name-"+name);
	System.out.println("email--"+email); 


}
static void nameAgeEmail(String name,String email,String age)
{
	System.out.println("name-"+name);
	System.out.println("email--"+email); 
	System.out.println("age--"+age); 
}
static void nameAgeHeightWeightAddress(String name,int age,int height,int weight,String address)
{
	System.out.println("name-"+name);
	System.out.println("age--"+age); 
	System.out.println("height-"+height); 
	System.out.println("weight-"+weight);
	System.out.println("address--"+address);  


}

}

