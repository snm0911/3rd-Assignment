package Ass;

class Sports{
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n player in "+ getName());
	}
}

class Soccer extends Sports{
	@Override
	String getName() {
		return "Soccer Class";
	}
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 player in "+ getName());
	}
}

public class Assignment3 {
	public static void main(String args[])
	{
		Sports a = new Sports();
		Soccer b = new Soccer();
		System.out.println(a.getName());
		a.getNumberOfTeamMembers();
		System.out.println(b.getName());
		b.getNumberOfTeamMembers();
	}
}
