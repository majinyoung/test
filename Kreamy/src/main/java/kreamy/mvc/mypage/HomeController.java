package kreamy.mvc.mypage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		String img1 = "https://kream-phinf.pstatic.net/MjAyMTAxMjZfNzUg/MDAxNjExNjU3OTU3NTgw.YNJ9nlLh8sj2g0mrY7BwSyVWeNGkPOkkDm8RB_LlVNwg."
				+ "8zjOyJAglqWaUK4rJkZ_QY11Ir7P0zYEgxYW8uj34Mgg.PNG/p_31db5ccb955f4f039bdff2ce16a75632.png?type=l";
		String img2 = "https://kream-phinf.pstatic.net/MjAyMDEwMjJfNDQg/MDAxNjAzMzM0MDA4MDA3.azLaavPKxrwrnMQQ-W7fKWMR_tn1PAmkhmC9EKWoVfgg."
				+ "rnkwcloZr4WJp89GQQzckQju6MnQwVA92Wh3CrZPYWcg.PNG/p_24909_0_18f2d6bbc62d4133b049aa331de2f340.png?type=l";
		
		request.setAttribute("img1", img1);
		request.setAttribute("img2", img2);
		
		return "mypage";
	}
	
}
