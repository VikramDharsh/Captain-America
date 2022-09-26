class Graduate
{
	static String[] name={null,null,null};
	 static int  position=0;
	 static boolean[] condition={true,true,false};
	 
	 static void saveName(String names,boolean value)
	 {
	 name[position]=names;
	 condition[position]=value;
	 position++;
	 }
	 static String displayDetails()
	 {
		 for(int index=0;index<name.length;index++)
		 {
			 String ref=name[index];
			 boolean ref1=condition[index];
			 System.out.println("name  :"+ref+"   he is graduate:"+ref1);
		 }
		 return "im smart engineer";
		 
	 }
}