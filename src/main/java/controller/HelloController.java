package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by littleTears on 2016-06-14.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap) {

        modelMap.addAttribute("message","Spring3MVC Hello");
        return "hello";
    }

    @RequestMapping(value = "/hello/{name:.+}",method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name")String name){

        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("msg",name);

        return model;
    }
}
