package com.w4c.example.web;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.w4c.example.exception.BusinessException;
import com.w4c.example.exception.ErrorCodes;
import com.w4c.example.exception.ErrorResponse;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello}")
	private String message = "Hola !";

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/fail")
	public String fail() throws BusinessException {
		throw new BusinessException(ErrorCodes.INTERNAL_SERVER_ERROR.name(), "Algo sucedio ...");
	}

	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleMyRuntimeException(BusinessException exception) {
		return new ErrorResponse(exception.getMessage());
	}

}
