class FoodItems
{
	static String[] name={null,null,null};
	 static int position=0;
	 static int[] price={0,0,0};
	 
	 static void saveName(String names,int value)
	 {
	 name[position]=names;
	 price[position]=value;
	 position++;
	 }
	 static String displayDetails()
	 {
		 for(int index=0;index<name.length;index++)
		 {
			 String ref=name[index];
			 int ref1=price[index];
			 System.out.println("name  :"+ref+"   price  :"+ref1+ "rupees");
		 }
		 return "full chindi taste";
		 
	 }
}