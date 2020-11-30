package com.hta.elevator.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin")
@RestController
public class ReturnController {
	
	
	@RequestMapping(value = "/{name}")
	public ModelAndView returnPage(@PathVariable String name,HttpServletRequest request) {
		return new ModelAndView(name);
	}

}
