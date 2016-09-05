package point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView hello() {

		String helloWorldMessage = "Welcome login to U!";
		return new ModelAndView("login", "message", helloWorldMessage);
	}

}
