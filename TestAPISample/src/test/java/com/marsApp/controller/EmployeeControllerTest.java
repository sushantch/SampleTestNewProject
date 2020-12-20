package com.marsApp.controller;


import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import com.marsApp.dto.Employee;
import com.marsApp.repo.EmployeeRepository;

@RunWith(PowerMockRunner.class)
public class EmployeeControllerTest {
    @Mock
    private EmployeeRepository employeeRepository;
    
    @Mock
    private Employee empMock;
    
    @InjectMocks
    EmployeeController empController;
    
    @Before
    public void setup() {
    	empController=new EmployeeController();
    }
	
    
    @Test(expected=NullPointerException.class)
    public void test_method_getAllEmployees() {
    	assertNull(empController.getAllEmployees());
    }

    @Test(expected=NullPointerException.class)
    public void test_method_getAllGetCount() {
    	assertNull(empController.getCount());
    }
    
    @Test(expected=NullPointerException.class)
    public void test_method_createEmployee() {
    	
    	empMock.setFirstName("test");
    	empMock.setId(1);
    	empMock.setLastName("testLast");
		assertNull(empController.createEmployee(empMock));
    }

   
}