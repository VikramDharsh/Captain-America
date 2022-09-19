class SportsRunner
{
	public static void main(String[] namess)
	{
		System.out.println("main method start");
		String[] players={"Rohith","gill","virat","panth","surya","hardik","dk","jaddu","bhuvi","bumra","yuzi"};
		Sports.cricketTeamMembers(players);
		System.out.println("main method end");
	
	
	System.out.println("start");
	int[] jercyNo={18,77,65,98,43,53};
	Sports.kabaddiTeamMembersJercyNumbers(jercyNo);
	System.out.println("end");
	
	
	
	System.out.println("start");
	double[] salary={43535,663636,636363,63663,43333,533121};
	Sports.footBallTeamMembersSalary(salary);
	System.out.println("end");
	
	
	
	System.out.println("start");
	long[] mobno={26265232L,992424242L,67242424,98242424L,9894242424L,984343434L};
	Sports.ludoTeamobileNumber(mobno);
	System.out.println("end");
	
	
	System.out.println("start");
	int[] matches={23,45,65,78,56,577,98};
	Sports.hockeyTeamMatesNumberOfMatches(matches);
	System.out.println("end"); 
	
	
	System.out.println("start");
	byte[] codes={44,91,65,78,56,57,98};
	Sports.kokoTeamMembersCountryCode(codes);
	System.out.println("end");
	
	System.out.println("start");
	boolean[] condition={true,false,true,true,true};
	Sports.lagoriTeamPlayersAlive(condition);
	System.out.println("end");
	
	
	
	
	
}
}