package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNum;
	private String shootRorL;
	private int games;
	private int goals;
	private int assists;
	
	public HockeyPlayer(String initname, int initjerseyNum, String initshootRorL, int initgames, int initgoals, int initassists) {
		name = initname;
		jerseyNum= initjerseyNum;
		shootRorL = initshootRorL;
		games = initgames;
		goals = initgoals;
		assists = initassists;
	}
	public int getGames() {
		return games;
	}
	public int getGoals() {
		return goals;
	}
	public int getAssists() {
		return assists;
	}
	public int findPoints() {
		return goals+assists;
	}

	public void runGame(int newgoals, int newassists) {
		games= games+1;
		goals = goals+ newgoals;
		assists= assists+newassists;
		
	}

	public static void main(String[] args) {
		HockeyPlayer player1 = new HockeyPlayer("Gabby", 131, "left", 15, 8, 4);
		player1.runGame(5, 3);
		System.out.println(player1.findPoints());

	}

}
