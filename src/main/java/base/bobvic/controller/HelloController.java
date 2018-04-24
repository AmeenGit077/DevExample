package base.bobvic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import base.bobvic.web.controller.AllBaseRequirement;

@Controller
public class HelloController extends AllBaseRequirement{
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}
	
	@RequestMapping(value = "/userdetails", method = RequestMethod.GET)
	public String index1(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		System.out.println("*****************-----------------------");
		return "index";
	}
	
	@RequestMapping(value = "/generic", method = RequestMethod.GET)
	public String generic(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "generic";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "login";
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(@RequestParam("uname")String uName ,@RequestParam("pwd")String pwd ) {
		return super.allProcess(uName,pwd);
	}
	
	@RequestMapping(value = "/loginProcess/multyPartFile", method = RequestMethod.GET)
	public String multyPartFile() {
		return "multyPartFile";
	}
	
	@RequestMapping(value = "/loginProcess/multyPartFile/process", method = RequestMethod.POST)
	public ModelAndView multyPartFileProcess(@RequestParam("mpartfile") MultipartFile file) {
		return super.multyPartFileProcess(file);
	}
	
	@RequestMapping(value = "/loginProcess/ajaxCall", method = RequestMethod.GET)
	public ModelAndView ajaxCall() {
		ModelAndView model = new ModelAndView();
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2222);
		l1.add(2223);
		l1.add(2224);
		l1.add(2225);
		model.addObject("listData",l1);
		model.setViewName("ajax_call");
		return model;
	}
	
	@RequestMapping(value = "/loginProcess/process/{userId}", method = RequestMethod.POST)
	public String summa(@PathVariable("userId") String listData) {
		System.out.println("*************------------------");
		System.out.println(listData);
		
		return "redirect:/loginProcess/ajaxCall";
	}
	
	/*@RequestMapping(value = "/loginProcess/process/{userId}", method = RequestMethod.GET)
	public String summa(@PathVariable("userId") String listData) {
		System.out.println("*************------------------");
		System.out.println(listData);
		return "redirect:/loginProcess/ajaxCall";
	}*/
}

