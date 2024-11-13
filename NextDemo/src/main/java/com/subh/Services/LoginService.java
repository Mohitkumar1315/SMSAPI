package com.subh.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subh.Repositories.StaffLoginRepositories;
import com.subh.model.Staff;

@Service
public class LoginService {

	@Autowired
	private StaffLoginRepositories repo;
	public Staff getStaffById(int id) 
	{
		return repo.getById(id);
	}

}
