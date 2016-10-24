package kongs.model.dto;

public class TeamBoard extends Board {
	private String teamId;

	public TeamBoard(){}
	public TeamBoard(String teamId) {
		super();
		this.teamId = teamId;
	}
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	
	
}
