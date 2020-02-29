package example.controller;

import example.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET , value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/addPage", method = RequestMethod.GET)
    public ModelAndView addPage() {
        return new ModelAndView("addStudent", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")Student student,
                             ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        System.out.println(student.getAge()+"--"+student.getId()+"---"+student.getName());
        return "result";
    }

    @RequestMapping(value = "/addByAjax", method = RequestMethod.GET)
    @ResponseBody
    public String addByAjax(String name , HttpServletRequest request) {
        String username= request.getParameter("name");
        System.out.println(username+"------"+name);
        return username;
    }
}