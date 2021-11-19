package com.hsbc.springboot.practice4.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.springboot.practice4.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/employeeList")
	public ModelAndView getemployeeList() {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee e1 = new Employee(7, "Dhoni", 45, "Sports", 100000);
		Employee e2 = new Employee(17, "Virta Kholi", 35, "Sports", 75000);
		Employee e3 = new Employee(2, "Sachin", 55, "Sports", 200000);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		ModelAndView mav = new ModelAndView("employeeList", "employeeList", employeeList);
		return mav;
	}
	
	@RequestMapping("/showAddEmployee")
	public ModelAndView showAddEmployeePage() {
		ModelAndView mav = new ModelAndView("addEmployee");
		return mav;
	}
}
