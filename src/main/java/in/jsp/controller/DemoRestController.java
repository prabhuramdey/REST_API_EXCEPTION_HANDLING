package in.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/welcome")
	public String getWelcomeMssge() {
		String msg="WELLCOME TO REST API....";
		int i=10/0;
		return msg;
	}
}
