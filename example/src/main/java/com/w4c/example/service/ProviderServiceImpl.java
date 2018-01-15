package com.w4c.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.w4c.example.exception.BusinessException;
import com.w4c.example.exception.ErrorCodes;
import com.w4c.example.objectDomain.Provider;
import com.w4c.example.objectDomain.Session;
import com.w4c.example.objectDomain.SessionByProvider;

@Service
public class ProviderServiceImpl implements IProviderService {

	@Override
	public List<SessionByProvider> getAll() throws BusinessException {
		try {
			String url = "https://pnny0h3cuf.execute-api.eu-west-1.amazonaws.com/dev/providers/1";
			RestTemplate restTemplate = new RestTemplate();

			HttpHeaders headers = new HttpHeaders();
			headers.set("Content-Type", "application/json");
			headers.set("Authorization", "Basic cJmAc71jah17sgqi1jqaksvaksda=");

			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			ResponseEntity<List<Provider>> r = restTemplate.exchange(url, HttpMethod.GET, entity,
					new ParameterizedTypeReference<List<Provider>>() {
					});

			Map<String, List<Provider>> map = new HashMap<String, List<Provider>>();
			List<SessionByProvider> byProviders = new ArrayList<SessionByProvider>();
			for (Provider p : r.getBody()) {

				for (Session s : p.getSessions()) {
					if (!map.containsKey(s.getName())) {
						map.put(s.getName(), new ArrayList<Provider>());
					}
					map.get(s.getName()).add(p);
				}

			}

			for (String key : map.keySet()) {
				SessionByProvider byProvider = new SessionByProvider();
				byProvider.setSessionName(key);
				byProvider.setProviders(map.get(key));
				byProviders.add(byProvider);
			}

			return byProviders;
		} catch (Exception e) {
			throw new BusinessException(ErrorCodes.BUSINESS_LOGIC_ERROR.name(), e.getMessage());
		}
	}

}
