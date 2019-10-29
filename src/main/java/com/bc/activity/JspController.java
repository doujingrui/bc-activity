package com.bc.activity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName TestController
 * @Descripetion TODO
 * @Author zhaosi
 * @Date 2019/9/17
 */
@Controller
public class JspController {


    @RequestMapping("/home")
    public ModelAndView home() {
        System.out.println("test111sss1112223333");
        return new ModelAndView("index");
    }
    
    @RequestMapping("/promo/{pageName}")
	public ModelAndView promo(@PathVariable(value = "pageName") String pageName,HttpServletRequest request, HttpServletResponse response){
		return new ModelAndView(pageName);
	}
}
