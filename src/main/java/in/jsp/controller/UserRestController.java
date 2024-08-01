package in.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.jsp.excepton.UserNotFoundException;

@RestController
public class UserRestController {

	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId") Integer userId)throws Exception {
		
		if(userId==100) {
			return "Puja";
		}else if(userId==200) {
			return "Simran";
		}else {
			throw new UserNotFoundException("User Not Found");
		}
	}
	
	
	
	
	
}
