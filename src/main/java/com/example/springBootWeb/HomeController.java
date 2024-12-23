package com.example.springBootWeb;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv){
//        int num1= Integer.parseInt((req.getParameter("num1")));
//        int num2= Integer.parseInt((req.getParameter("num2")));
        int result=num+num2;

        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("/addAlien")
    public ModelAndView addAlien(Alien alien, ModelAndView mv){

        mv.addObject("alien",alien);
        mv.setViewName("alien");

        return mv;
    }
}
