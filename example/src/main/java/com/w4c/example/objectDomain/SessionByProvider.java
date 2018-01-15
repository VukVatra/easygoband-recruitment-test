package com.w4c.example.objectDomain;

import java.util.List;

public class SessionByProvider {

	private String sessionName;

	private List<Provider> providers;

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

}
