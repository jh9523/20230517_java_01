package kh.lclass.openapi.model.vo;

public class MetalVo {
	private String sdate;
	private String stationcode;
	private String itemcode;
	private String timecode;
	private String value;
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getStationcode() {
		return stationcode;
	}
	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public String getTimecode() {
		return timecode;
	}
	public void setTimecode(String timecode) {
		this.timecode = timecode;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "MetalVo [sdate=" + sdate + ", stationcode=" + stationcode + ", itemcode=" + itemcode + ", timecode="
				+ timecode + ", value=" + value + "]";
	}

	
	
	
}
