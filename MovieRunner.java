class MovieRunner
{
	public static void main(String[] kgf)
	{
		Movie.movieDetails();
		 Movie.type="hollywood";
		 Movie.budget=200;
		 Movie.directorName="prashanth neel";
		 Movie.length=2;
		 Movie.shootingdays=4;
		 
		 String[] mainCharcters={"rocky bahi","ramika sen","adheera"};
		 Movie.mainCharcters=mainCharcters;
		 
		 String[]  mainMaleCharcters={"rocky bhai","adheera"};
		  Movie.mainMaleCharcters= mainMaleCharcters;
		  
		  String[] mainFemaleCharcters={"reena","ramika","mangamma"};
		  Movie.mainFemaleCharcters=mainFemaleCharcters;
		  
		  String[] releasedLanguage={"kannada","telugu","himdi","------"};
		  Movie.releasedLanguage=releasedLanguage;
		  
		  String[]  otherLangluageActors={"sanjay dutt","raveena","__"};
		  Movie.otherLangluageActors= otherLangluageActors;
		  
		  String[] producers={"vijay kiragandoor","hombaale"};
		  Movie.producers=producers;
		  
		  String[] distributers={"dil raaju","vishaal"};
Movie.distributers=distributers;

String[] asstDirectors={"bhuvan gowda","ravi basoor"};
Movie.asstDirectors=asstDirectors;

String[] songs={"salam rocky bhai","dheera dheeara","tanadane thane thane"};	
Movie.songs=songs;

String[] singers={"vijay prakash","ananya bhat"};	
Movie.singers=singers;

String[] awards={"SIMA","filmfare"};
Movie.awards=awards;

long[] totalGross={1250}; 
Movie.totalGross=totalGross;
 
		  System.out.println("kgf movie detatails");
		 Movie.movieDetails();
	}
}