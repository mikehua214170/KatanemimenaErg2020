package gr.hua.dit.ds.springmvcdemo1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.hua.dit.ds.springmvcdemo1.dao.AitiseisDAO;
import gr.hua.dit.ds.springmvcdemo1.entity.Aitiseis;


@Controller
@RequestMapping("/atiseis")
public class AitiseisController {
	
	@Autowired
    private AitiseisDAO aitiseisDAO;
	
	
	@GetMapping("/list")
    public String listAitiseis(Model model) {
        	
     // get customers from dao
        List<Aitiseis> aitiseis = aitiseisDAO.getAitiseis();
        
        // add the customers to the model
        model.addAttribute("aitiseis", aitiseis);
        
        return "listAllAitiseis";
	}
    /****    
   @RequestMapping(value="/newAitisi", method = RequestMethod.POST)
    public String addAitisi(HttpServletRequest request, Model model) {
	   String applicantName = request.getParameter("studentName");
	    theName = theName.toUpperCase();

	    String result ="Hello " + theName;

	    model.addAttribute("message",result);
    	
    	return "aitisi-form";
	
	}
****/

}