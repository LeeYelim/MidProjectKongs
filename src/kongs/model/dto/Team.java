package kongs.model.dto;

public class Team {
	private String teamId; // �� ���̵�
	private String id; // �� �Ҽ� ȸ�� ���̵�
	
	public Team(){}
	public Team(String teamId, String id) {
		super();
		this.teamId = teamId;
		this.id = id;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
