package ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Bills {
	
	private int id;
	private String title;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date title_time;
	private int type_id;
	private double price;
	private String explan;
	
	private String name;//类型名称
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getTitle_time() {
		return title_time;
	}
	public void setTitle_time(Date title_time) {
		this.title_time = title_time;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExplan() {
		return explan;
	}
	public void setExplan(String explan) {
		this.explan = explan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
