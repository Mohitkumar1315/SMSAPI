package com.subh.CenterController;
import org.springframework.ui.Model;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.subh.CenterServices.UserService;
import com.subh.DTO.MaxCenter;
import com.subh.model.Staff;
import com.subh.model.StaffLogin;
import com.subh.model.StaffLogin1;

@Controller
@RequestMapping("/subhlakshmi")
public class CreateCenterController 
{	
	@Autowired
	UserService userService;
	@RequestMapping(value = { "/CenterEntry.spr" })
	public ModelAndView getCenterEntry(@ModelAttribute("staffentry") StaffLogin staffentry,
			HttpServletRequest request,Model model) 
	{
		
		System.out.println("Hello");
		Staff staff=  (Staff) request.getSession().getAttribute("StaffLogin");
        String staffName = (String) request.getSession().getAttribute("staffName");
        String staffpassword=(String) request.getSession().getAttribute("staffPassword");
       // String staffid=staff.getStaffId();
        //System.out.println("Password in center creation controller"+staffpassword);
        System.out.println(staff);
       int staffid=staff.getStaff_id();
       StaffLogin stafflogin=new  StaffLogin();
       stafflogin.setStaffid(staffid);
       System.out.println(stafflogin);
       
		return new ModelAndView("/pages/center/CenterForm");
	}
	@RequestMapping(value = "/createCenter", method = RequestMethod.POST)
	public ModelAndView getCenterForm(@RequestParam("branch") String branchId,@RequestParam("branchName")String branchName, Model model) {
	    // You can now access the branchId value here
	    System.out.println("Selected Branch name: " + branchName);
	    //Consuming api
	    
	    String url="http://localhost:8084/center/maxCenter/"+branchId;
	    RestTemplate restTemplate=new RestTemplate();
	    MaxCenter max=restTemplate.getForObject(url,MaxCenter.class);
	    
	    // Pass the branchId to the view if needed
	    model.addAttribute("maxId", max.getMaxid());
	    ModelAndView mav = new ModelAndView("/pages/center/centerEnteryForm");
	   // mav.addObject("branchId", branchId);
	    return mav;
	}
	@RequestMapping("/test")
	public String gettest()
	{
		System.out.println("hlo babu");
		return "hlo";
	}
	//testing 
	@RequestMapping("/kissanDhanCenter")
	public String getKissanDhanCenter() 
	{
		return "pages/KissanDhanMap/uploadCenter";
	}

}
