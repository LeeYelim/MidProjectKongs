package kongs.model.dto;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String nick; // ´Ð³×ÀÓ
	
	public Member(){}
	public Member(String id, String pwd, String name, String nick) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.nick = nick;
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
}
