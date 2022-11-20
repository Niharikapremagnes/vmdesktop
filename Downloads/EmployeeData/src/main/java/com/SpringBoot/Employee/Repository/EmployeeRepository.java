package com.SpringBoot.Employee.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.SpringBoot.Employee.Entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
	public Employee findById(int id);
}
