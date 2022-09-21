class Satelite{
static int ref=23;

 static void  navigation()// static method  declaration  // here navigation is the main method
{ // static method can be accces in any other class by just using classname.method()
	System.out.println("satelite navigation"); 
}// static method initialization, 
	

 static void  gps(){
System.out.println("satelite navigation uses 24 satelite for gps system");
}
 static void  communication()
{
		System.out.println("satelite navigation uses is managed by USA airforce defence for communication");	
}
static void  wetherForecasting()
{
		System.out.println("satelite navigation used for wetherForecasting");	
}

static void  survelence()
{
		System.out.println("satelite navigation uses is managed by USA airforce defence");	
}
static void monitering()
{
	System.out.println("satelite navigation used for monitering");	
}
static void   defence()
{
	System.out.println("satelite navigation used for defence system");	
}
static void televisionSignal()
{
System.out.println("satelite navigation used for televisionSignal");
Satelite.gps();//
gps();
}

}