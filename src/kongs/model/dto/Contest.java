package kongs.model.dto;

public class Contest {
	private int num; // ������ ��ȣ
	private String title; // ��������
	private String sponser; // ���ֻ�
	private String category; // �о� ex) design, advertisement, it, media, idea
	private String startDate; // ������
	private String endDate; // ������
	private int clickCount; // ��ȸ��
	private String regDate; // �� ����� 
	private String photoName; // ������
	
	public Contest(){}
	
	public Contest(int num, String startDate, String endDate ) {
		super();
		this.num = num;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	public Contest(int num, String title, String sponser, String category, String startDate, String endDate,
			int clickCount, String regDate, String photoName) {
		super();
		this.num = num;
		this.title = title;
		this.sponser = sponser;
		this.category = category;
		this.startDate = startDate;
		this.endDate = endDate;
		this.clickCount = clickCount;
		this.regDate = regDate;
		this.photoName = photoName;
	}


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSponser() {
		return sponser;
	}
	public void setSponser(String sponser) {
		this.sponser = sponser;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getClickCount() {
		return clickCount;
	}
	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
}
