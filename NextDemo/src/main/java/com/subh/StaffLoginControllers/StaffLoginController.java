package com.subh.StaffLoginControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.subh.Services.LoginService;
//import com.subh.Services.LoginService;
import com.subh.model.Staff;
import org.springframework.ui.Model;
@Controller
@RequestMapping("subhlakshmi")
public class StaffLoginController 
{
   //	HttpServletRequest request=null;
	
	@Autowired
	private LoginService service;
	HttpSession session;
	
    @RequestMapping("/login")
    public String loginPage(){
        return "auth-login";
    }

    @RequestMapping("/home")
    public String validateLogin(String username ,String password,Model model,HttpSession session,HttpServletRequest request)
	{		
		System.out.println("Employee id :"+username+"and password is:"+password+"");
		int id=Integer.parseInt(username);
		Staff staff=service.getStaffById(id);
		String staffPassword=staff.getPassword();
		int staffid=staff.getStaff_id();
		System.out.println(staffid);
		request.setAttribute("staffId", staffid);
		String staffname=staff.getName();
		System.out.println(staffname);
		request.setAttribute("staffName", staffname);
		int stafflive=staff.getStafflive();
		System.out.println("staffLive:"+stafflive+"");
		String dbid=String.valueOf(staffid);
		if(username.equals(dbid) && password.equals(staffPassword))
		{
			System.out.println("helo");
			System.out.println(staff.getStaff_id());
			
			session.setAttribute("StaffLogin", staff);
			session.setAttribute("name", "Vikas"+ "");
			session.setAttribute("staffPassword",staffPassword);
			if(stafflive==1)
			{
		     //	return "redirect:../success";
				session.setAttribute("staffId", staffid);
				session.setAttribute("staffName",staffname);
				session.setAttribute("StaffLogin",staff);
				return "/pages/landing_page";
			}
			else
			{
				model.addAttribute("msg", "Employee with ID: "+dbid+" isn't live");
				  return "auth-login";
			}
		}
		else {
		model.addAttribute("msg", "May be somthing went worng! plese check your password and ID");
		System.out.println("wrong");
		return "auth-login";
		}
	}
    @RequestMapping("success")
	public String getHome()
	{
		return "../pages/landing_page";
	}
    @RequestMapping("dashboard")
    public String getDashBoard()
    {
    	return "/pages/landing_page"; 
    }
}
