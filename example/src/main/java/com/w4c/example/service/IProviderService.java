package com.w4c.example.service;

import java.util.List;

import com.w4c.example.exception.BusinessException;
import com.w4c.example.objectDomain.SessionByProvider;

public interface IProviderService {

	public List<SessionByProvider> getAll() throws BusinessException;
	
}
