package com.ComponentMapping.ComponentMappingExample;

import com.ComponentMapping.ComponentMappingExample.entities.Address;
import com.ComponentMapping.ComponentMappingExample.entities.Employee;
import com.ComponentMapping.ComponentMappingExample.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class ComponentMappingExampleApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test

	void testcreateEmployee()
	{
		Employee emp=new Employee();

		emp.setEmployeeId(1);
		emp.setEmployeeName("Rahul");

		Address address=new Address();
		address.setCity("Banglore");
		address.setStreetAddress("3rd main,2nd cross");
		address.setCountry("India");
		address.setZipCode("560098");
		address.setState("Karnataka");
		emp.setAdress(address);

		employeeRepository.save(emp);

	}

}
