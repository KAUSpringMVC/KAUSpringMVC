package net.kau.diyscheduler.accounts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class JoinController {	
	
	@RequestMapping("/Join")
	public String home(){
		
		return "accounts/join";
	}
}
