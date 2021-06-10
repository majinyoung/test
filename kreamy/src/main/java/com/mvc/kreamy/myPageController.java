package com.mvc.kreamy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class myPageController {
	
	
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	public String myPage() {
		return "myPage/myPage";
	}
	
	@RequestMapping(value = "/buying", method = RequestMethod.GET)
	public String buying() {
		return "myPage/buying";
	}
	
	@RequestMapping(value = "/selling", method = RequestMethod.GET)
	public String selling() {
		return "myPage/selling";
	}
	
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String wish() {
		return "myPage/wish";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile() {
		return "myPage/profile";
	}
	
	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public String address() {
		return "myPage/address";
	}
	
	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public String payment() {
		return "myPage/payment";
	}
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String account() {
		return "myPage/account";
	}
	
}
