package com.subh.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subh.model.Staff;

public interface StaffLoginRepositories  extends JpaRepository<Staff, Integer>
{

}
