package ua.danni.controller;

/**
 * Created by Artem on 26.03.2016.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/second")
    public String indexPage() {
        return "secondPage";
    }

    @RequestMapping(value = "/admin")
    public String adminPage() {
        return "adminPage";
    }

    @RequestMapping(value ="/welcome", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username or password!");
        }
        model.setViewName("welcomePage");
        return model;

    }

}
