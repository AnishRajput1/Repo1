class Team
{
	private String teamname;

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	TeamS teamstrategy;
	String teaminfo()
	{
		return teamstrategy.play();
	}
	public void playgame(TeamS newteamstrategy)
	{
		newteamstrategy = teamstrategy; 
	}
}
class TeamA extends Team
{
	TeamA()
	{
		teamstrategy = new AS();
	}
}
class TeamG extends Team
{
	TeamG()
	{
		teamstrategy = new DS();
	}
}
interface TeamS
{
	String play();
}
class AS implements TeamS
{
	public String play() 
	{
		return "GO ATTACK";
	}
}
class DS implements TeamS
{
	public String play() 
	{
		return "GO DEFENSIVE";
	}
}
public class Mainclass
{
	public static void main(String args [])
	{
		TeamA A = new TeamA();
		TeamG G = new TeamG();
		A.setTeamname("Argentina");
		G.setTeamname("Germany");
		System.out.println(""+A.getTeamname());
		System.out.println(""+A.teaminfo());
		System.out.println(""+G.getTeamname());
		System.out.println(""+G.teaminfo());
		
		A.teamstrategy = new DS();
		System.out.println(""+A.getTeamname());
		System.out.println(""+A.teaminfo());
	}
}