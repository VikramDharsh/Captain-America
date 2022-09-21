class MyAge{

static void LifeLine()//acces specifirs or non , returntype ,metod name (parameter){}
{
	System.out.println("life at different ages using if and runner condition");
	int age=21;
	int cricketCraze=12;
	String gender="m";
	short ref=35;
	byte rip=70;
	if(age==12||age<30)
	{
	System.out.println("cricket craze starts at age"+cricketCraze);
	return; //return; is used when return type is void 
	// return refference; is used when return type is not void
	}
	if(age==14&&gender=="m")
	{
		System.out.println("first love");
		System.out.println("first and best love");
	return;}
	 if(age==16)
	 {
		 System.out.println("first love gon");
		 return;
	 }
		 if(age==18&&gender=="m")
		 {
			 System.out.println("first love gon");
			 System.out.println("im depressed");
			 return;
		 }
		 if(age==21||gender=="m")
		 {			 System.out.println("second love gon");
	 			 System.out.println("searching for 3rd love");
				 return;
		 }
		 else
		 {
			 			 System.out.println("solo life so better");
						 			 System.out.println("being single is not a curse its a honour");
		 }
		 if(age<30||ref<60)
		 {
			 System.out.println("arrange marrige");
			 System.out.println("no choice parents wish");
			 System.out.println("job is must and should or youll get scold badly");
			 return;
		 }
		 if(age==35)
		 {System.out.println("2kids ");}
	 if(age==45)
	 {System.out.println("kids school");
	 return;
	 }
	 if(age>45||ref==35)
	 {System.out.println("parents meeting kids 1st love and all");
 return;
	 }
	 if(age<45&ref==35)
	 {
		 System.out.println("2nd innings");
	 return;}
		 if(rip<100)
		 {
			 System.out.println("tata bye bye im gon");
			 return;
			 
}
}	
	 
}
