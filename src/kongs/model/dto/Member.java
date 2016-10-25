package kongs.model.dto;

public class Member {
	
	private String id;
	private String pwd;
	private String name;
	private String nick; // �г���
	private String teamId; // ���̸�
	
	public Member(){}
	public Member(String id, String pwd, String name, String nick) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.nick = nick;
	}
	public Member(String id, String pwd, String name, String nick, String teamId) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.nick = nick;
		this.teamId = teamId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
}
