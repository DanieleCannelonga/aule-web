package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Supervisor;

public interface SupervisorService {
	
	public List<Supervisor> getAllSupervisors();

	Supervisor saveOrUpdate(Supervisor supervisor);

	Supervisor getSupervisorById(Long idSupervisor);

	void deleteSupervisor(Long idSupervisor);

}