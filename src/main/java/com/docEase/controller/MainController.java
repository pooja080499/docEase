package com.docEase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.docEase.Dao.DoctorRepository;
import com.docEase.Dao.UserDataRepository;
import com.docEase.Dao.UserRepository;
import com.docEase.entities.Doctor;
import com.docEase.entities.User;
import com.docEase.helper.Messege;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@Autowired
	private UserDataRepository userdataRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@GetMapping("/")
	public String base(Model model)
	{
		
		System.out.println("This is Home Page...");
		
		model.addAttribute("name","Pooja sharma");
		return "base";
	}
	
	
	@GetMapping("/login")
	public String Login(@ModelAttribute("user") User user,Model model)
	{
		return "login";
	}
	
	
	@GetMapping("/about")
	public String about(Model model)
	{
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("user",new User());
		return "Register";
	}
	
	@GetMapping("/help")
	public String help(Model model)
	{
		return "help";
	}

	
	@RequestMapping(value="/do_register", method=RequestMethod.POST)
	public String Register(@ModelAttribute("user") User user,@RequestParam(value="specialization") String specialization,@RequestParam(value="year_of_experience") String year_of_experience,@RequestParam(value="licence") String licence,@RequestParam(value="clinic_Address") String clinic_Address,Model model,HttpSession session)
	{	
		try {
		if(user.getRole().equals("patient"))
		{user.setRole("Patient");
		System.out.println("user="+user);
		User result=this.userdataRepository.save(user);
		model.addAttribute("user",new User());
		session.setAttribute("messege",new Messege("Successfully Registered","alert-Success"));
		return "Register";
		
		}
		
		else
		{
			user.setRole("Doctor");
			
			Doctor doctor=new Doctor(specialization,year_of_experience,licence,clinic_Address);
			
			System.out.println("user="+user);
			System.out.println("doctor="+doctor);
			
			User result=this.userdataRepository.save(user);
			doctor.setDocid(result.getId());
			System.out.println("result="+result);
			Doctor doc=this.doctorRepository.save(doctor);
			model.addAttribute("user",new User());
			session.setAttribute("messege",new Messege("Successfully Registered","alert-Success"));
			return "Register";
		}
		}catch(Exception e)
		{
			e.printStackTrace();
			model.addAttribute("user",user);
			session.setAttribute("messege",new Messege("Something went wrong in server side please try again after some time....","alert-danger"));
		}
		
		
		
		return "Register";
	}
	
	

}
