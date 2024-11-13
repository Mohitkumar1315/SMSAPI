package com.subh.CenterServices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.websocket.Session;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subh.model.Staff;
import com.subh.model.StaffLogin1;

@Repository("userDao")
public class UserDaoImpl implements UserDao
{

	  @PersistenceContext
	    private EntityManager entityManager;
	  @Autowired
	    public void setEntityManager(EntityManager entityManager) 
	  	{
	        this.entityManager = entityManager;
	  	}
	        @Override
	public List<Staff> findUser(StaffLogin1 user) 
	{
		 TypedQuery<Staff> query = entityManager.createQuery("SELECT s FROM Staff s WHERE s.staffId = :staffId AND s.staffPassword = :password AND s.stafflive = true", Staff.class);
		    query.setParameter("staffId", user.getStaffId());
		    query.setParameter("password", user.getStaffPassword());
		    return query.getResultList();
	}

}
