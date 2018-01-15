package com.w4c.example.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.w4c.example.objectDomain.SessionByProvider;
import com.w4c.example.service.IProviderService;

@Controller
@RequestMapping(value = "/provider")
public class ProviderController {

	@Autowired
	private IProviderService providerService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<SessionByProvider> getAll(HttpSession session) throws Exception {
		try {
			List<SessionByProvider> providers = providerService.getAll();
			return providers;
		} catch (Exception e) {
			throw e;
		}
	}

}
