package com.wiredbrain.friends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@Controller marks this class as a Spring MVC controller.
//@RequestMapping flags the index() method to support the / route.
//It returns index as the name of the template, which Spring Boot’s autoconfigured view resolver will map to src/main/resources/templates/index.html.
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
