class Movie
{
	static String type;
	static long budget;
	static String directorName;
	static float length;
	static short shootingdays;
	static String[] mainCharcters;
	static String[] mainMaleCharcters;
	static String[] mainFemaleCharcters;
	static String[] releasedLanguage;
	static String[] otherLangluageActors;
	static String[] producers;
	static String[] distributers;
	static String[] asstDirectors;
	static String[] songs;
	 static String[] singers;
	 static String[] awards;
	 static long[] totalGross;
	 
	 
	 static void movieDetails()
	 {
		 System.out.println("start");
		 System.out.println("type  "+type);
		 System.out.println("budget  "+budget);
		 System.out.println( "director  "+directorName);
		 System.out.println( "length  "+length);
		 System.out.println("shootingdays  "+shootingdays);
		 
		if(mainCharcters!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index=0;index<mainCharcters.length;index++)
			{
				 System.out.println("     ");
				String ref=mainCharcters[index];
				System.out.println("mainCharcters  :"+ref);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		
		if(mainMaleCharcters!=null)
		{
			for(int index1=0;index1<mainMaleCharcters.length;index1++)
			{
				System.out.println("     ");
				System.out.println("reference is not pointing to null");
				String ref1=mainMaleCharcters[index1];
				System.out.println("mainMaleCharcters  :"+ref1);
			}
		}
		 else
		{
			System.out.println("reference is  pointing to null");
		}
		 
				if(mainFemaleCharcters!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index3=0;index3<mainFemaleCharcters.length;index3++)
			{
				System.out.println("     ");
				String ref3=mainFemaleCharcters[index3];
				System.out.println("mainFemaleCharctersCharcters  :"+ref3);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		} 
		 
		 		if(releasedLanguage!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index4=0;index4<releasedLanguage.length;index4++)
			{
				System.out.println("     ");
				String ref4=releasedLanguage[index4];
				System.out.println("releasedLanguage  :"+ref4);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		
		 		if(otherLangluageActors!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index5=0;index5<otherLangluageActors.length;index5++)
			{
				System.out.println("     ");
				String ref5=otherLangluageActors[index5];
				System.out.println("otherLangluageActors  :"+ref5);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		
		 		if(producers!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index6=0;index6<producers.length;index6++)
			{
				System.out.println("     ");
				String ref6=producers[index6];
				System.out.println("producers  :"+ref6);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		 		if(distributers!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index7=0;index7<distributers.length;index7++)
			{
				System.out.println("     ");
				String ref7=distributers[index7];
				System.out.println("distributers  :"+ref7);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		 		if(asstDirectors!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index8=0;index8<asstDirectors.length;index8++)
			{
				System.out.println("     ");
				String ref8=asstDirectors[index8];
				System.out.println("co director  :"+ref8);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		 		if(songs!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index9=0;index9<songs.length;index9++)
			{
				System.out.println("     ");
				
				String ref9=songs[index9];
				System.out.println("songs  :"+ref9);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		 		if(singers!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index10=0;index10<singers.length;index10++)
			{
				System.out.println("     ");
				String ref10=singers[index10];
				
				System.out.println("singer :"+ref10);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		 		if(awards!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index11=0;index11<awards.length;index11++)
			{
				System.out.println("     ");
				String ref11=awards[index11];
				
				System.out.println("award :"+ref11);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
		
		 		if(totalGross!=null)
		{
			System.out.println("reference is not pointing to null");
			for(int index12=0;index12<totalGross.length;index12++)
			{
				System.out.println("     ");
				long ref12=totalGross[index12];
				
				System.out.println("totalGross :"+ref12);
			}
		}
		else
		{
			System.out.println("reference is  pointing to null");
		}
	 }
}
