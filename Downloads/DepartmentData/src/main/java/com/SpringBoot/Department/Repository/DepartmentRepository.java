package com.SpringBoot.Department.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Department.Entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department , Integer>
{
	public Department findById(int id);
}
