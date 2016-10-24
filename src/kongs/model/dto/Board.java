package kongs.model.dto;

public class Board {
	private int boardNum; // �Խ��� ��ȣ
	private String category; // �Խ��� ����
	private String title; // �� ����
	private String contents; // �� ����
	private String writer; // �۾���
	private String regDate; // �� ��� ��¥
	private int clickCount; // ��ȸ��
	private String fileName; // ���ϸ�
	
	public Board(){}
	public Board(int boardNum, String category, String title, String contents, String writer, String regDate,
			int clickCount, String fileName) {
		super();
		this.boardNum = boardNum;
		this.category = category;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.regDate = regDate;
		this.clickCount = clickCount;
		this.fileName = fileName;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getClickCount() {
		return clickCount;
	}
	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
