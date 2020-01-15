package com.bawei.entity;

public class Plan {

	
	/**  **/
	private Integer id;
	/**  **/
	private String name;
	/**  **/
	private String amount;
	/**  **/
	private String manager;
	/**  **/
	private String content;
	/**  **/
	private Integer did;
	
	private String cname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Plan(Integer id, String name, String amount, String manager, String content, Integer did, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.manager = manager;
		this.content = content;
		this.did = did;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", amount=" + amount + ", manager=" + manager + ", content="
				+ content + ", did=" + did + ", cname=" + cname + "]";
	}
	public Plan() {
	}

}
