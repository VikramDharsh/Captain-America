class PoliticiansOperator
{
	static String[] name={null,null,null};
	 static int position=0;
	 static int[] blackMoney={0,0,0};
	 
	 static void saveName(String names,int value)
	 {
	 name[position]=names;
	 blackMoney[position]=value;
	 position++;
	 }
	 static String displayDetails()
	 {
		 for(int index=0;index<name.length;index++)
		 {
			 String ref=name[index];
			 int ref1=blackMoney[index];
			 System.out.println("name  :"+ref+"   blackMoney   :"+ref1+ "crores");
		 }
		 return "scam sons";
		 
	 }
}