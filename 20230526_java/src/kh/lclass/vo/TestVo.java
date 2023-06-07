package kh.lclass.vo;

public class TestVo {
	private int boardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	
	
	public TestVo(int num) {
//		boardNum = num+1000;
		boardNum = (int)System.currentTimeMillis() +num;
	}
	
	public TestVo(int a, String writer) {
		this(a);
		boardWriter = writer;
	}
	
	public TestVo(int boardNum, String boardWriter, String boardTitle, String boardContent
			,String boardDate) {
		this.boardNum = boardNum;
		this.boardWriter = boardWriter;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardDate = boardDate;		
	}
	
	
	
	public int getboardNum() {
		return boardNum;
	}
	
	public void setboardNum(int boardNum) {
		this.boardNum= boardNum;
	}
	public String getboardWriter() {
		return boardWriter;
	}
	public void setboardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	
	public String getboardTitle() {
		return boardTitle;
	}
	public void setboardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getboardContent() {
		return boardContent;
	}
	
	public void setboardContent(String boardConetent) {
		this.boardContent = boardConetent;
	}
	
	public String getboardDate() {
		return boardDate;
	}
	public void setboardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
}
