package com.markating.services;

import java.util.List;

import com.markating.entity.Lead;

public interface LeadService {
	
	public void saveLead(Lead lead);
	public List<Lead> getLeads();


}
