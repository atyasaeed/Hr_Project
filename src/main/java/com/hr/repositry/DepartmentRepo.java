package com.hr.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.entity.DepartementEntity;
@Repository
public interface DepartmentRepo extends JpaRepository<DepartementEntity, Integer> {
	
	

}
