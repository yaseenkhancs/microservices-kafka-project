package uk.ac.york.eng2.trending.cli.helpers;

public class NameTotalPair {
	
	private String name;
	private Integer total;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public NameTotalPair(String name, Integer total) {
		super();
		this.name = name;
		this.total = total;
	}
}
