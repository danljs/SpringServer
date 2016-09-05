
package point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PointController {

	@RequestMapping("/point")
	public ModelAndView hello() {

		String helloWorldMessage = "The story behind the story!";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}

}
