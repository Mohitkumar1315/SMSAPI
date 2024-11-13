package com.subh.CenterServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.subh.model.Staff;
import com.subh.model.StaffLogin1;
@Service("UserService")
public class UserServiceImpl implements UserService 
{
	@Autowired
	UserDao userDao;
	
	@Autowired
	UserDaoImpl userDaoimpl;
	@Override
	public List<Staff> findUser(StaffLogin1 user) 
	{
		return userDao.findUser(user);
	}	
}


