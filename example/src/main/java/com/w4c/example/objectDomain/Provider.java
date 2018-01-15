package com.w4c.example.objectDomain;

import java.util.Date;
import java.util.List;

public class Provider {

	private String access_group_name;
	private int access_group_id;
	private long total_uses;
	private List<Session> sessions;
	private int event_id;
	private boolean structure_decode;
	private String name;
	private Date modified;
	private int id;
	private int basic_product_id;

	public String getAccess_group_name() {
		return access_group_name;
	}

	public void setAccess_group_name(String access_group_name) {
		this.access_group_name = access_group_name;
	}

	public int getAccess_group_id() {
		return access_group_id;
	}

	public void setAccess_group_id(int access_group_id) {
		this.access_group_id = access_group_id;
	}

	public long getTotal_uses() {
		return total_uses;
	}

	public void setTotal_uses(long total_uses) {
		this.total_uses = total_uses;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public boolean isStructure_decode() {
		return structure_decode;
	}

	public void setStructure_decode(boolean structure_decode) {
		this.structure_decode = structure_decode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBasic_product_id() {
		return basic_product_id;
	}

	public void setBasic_product_id(int basic_product_id) {
		this.basic_product_id = basic_product_id;
	}

}
