class Amazon // poly morphism
{
	static double productDelovery(double Price) //method over loading
	{
	System.out.println("enetered price--"+Price); //1 different in type of parameter
	return 70d;
	}
		static String productDelovery( String name)
		{
			System.out.println("enetered name :"+name);
			return "m";
		
}



static char productDelovery( double pantPrice, char pantSize)
{                                                             

System.out.println( "type of pant"); 
if(pantPrice==32||pantSize=='L')
{
	System.out.println( "size"); 
	return 'd';
}  
return 0;             //2 different in number of parameter
}
static char productDelovery( double discount,String typeOfpant,int total,float withOutdiscount,char size)
{
System.out.println( "discount on pant pant"); 

return size;
}               

}