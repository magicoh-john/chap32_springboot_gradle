package com.javalab.bootgradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String goHome(Model model) {
		//System.out.println("goHome");		
		log.info("lombok log.....goHome");
        model.addAttribute("java", "1.8");
		return "home";
	}

	/*
	 * Rest 방식으로 클라이언트의 바디(body)에 JSON 형태로 데이터가 전달되기 위해서는
	 * <jackson-databind> 라이브러리가 필요한데, Gradle에서는 [Spring Web] 
	 * 라이브러리만 추가해도 자동으로 들어온다.
	 */
	@RequestMapping(value = "/rest", method=RequestMethod.GET)
	@ResponseBody
	public String goHome2(Model model) {
		log.info("goHome2");
		model.addAttribute("java", "1.8");
		return "Rest 방식의 응답 페이지의 Body에 바로 출력";
	}
}
