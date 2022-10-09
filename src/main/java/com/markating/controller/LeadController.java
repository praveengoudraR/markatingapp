package com.markating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.markating.dto.LeadData;
import com.markating.entity.Lead;
import com.markating.services.LeadService;


@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreateLeadPage1")
	public String ViewCreatePage() {
		return "create_lead";
	}
		
//Storing the data in database this is the 1 st method
		
		@RequestMapping("/saveLead")
		public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("msg", "Lead is Saved!!");
		return "create_lead";
			
		}
		
//Storing the data in database this is the 2 nd method
		
//		@RequestMapping("/saveLead")
//		public String saveOneLead(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("email") String email, @RequestParam("mobile") long mobile) {
//		Lead l = new Lead();
//		l.setFirstName(firstName);
//		l.setLastName(lastName);
//		l.setEmail(email);
//		l.setMobile(mobile);
//		leadService.saveLead(l);
//		return "create_lead";

//		}
	

	
	//Third method(aprroch) to store the data in database that is "Data Transfor Object"[DTO]
//		@RequestMapping("/saveLead")
//		public String saveOneLead(LeadData data, ModelMap model) {
//			Lead l = new Lead();
//			l.setFirstName(data.getFirstName());
//			l.setLastName(data.getLastName());
//			l.setEmail(data.getEmail());
//			l.setMobile(data.getMobile());
//			model.addAttribute("msg", "Lead is Saved!!");
//			leadService.saveLead(l);
//			return "create_lead";
			
//		}
		
		
//JSTL TAG USING BELLOW

		@RequestMapping("/listall")
		public String getAllLeads() {
			List<Lead> leads = leadService.getLeads();
			System.out.println(leads);
			return "";
			
		}
	
		
	
}
