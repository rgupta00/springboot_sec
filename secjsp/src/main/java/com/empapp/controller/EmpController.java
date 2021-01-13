package com.empapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeNotFoundException;
import com.empapp.service.EmployeeService;

@RequestMapping(path = "admin")
@Controller
public class EmpController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "viewAll", method = RequestMethod.GET)
	public ModelAndView viewAll() {
		ModelAndView m = new ModelAndView();
		m.setViewName("viewAll");
		m.addObject("emps", employeeService.getAll());
		return m;
	}

	@RequestMapping(value = "addEmp", method = RequestMethod.GET)
	public String showEmpForm(ModelMap map) {
		Employee emp = new Employee();
		map.addAttribute("emp", emp);
		return "empform";
	}

	@RequestMapping(value = "addEmp", method = RequestMethod.POST)
	public String submittedEmpForm(
			@ModelAttribute(value = "emp") Employee employee) {
		System.out.println("--------------------------");
		System.out.println(employee);
		int id = employee.getId();
		if (id == 0) {
			employeeService.save(employee);
		} else {
			employeeService.update(id, employee);
		}
		return "redirect:viewAll";
	}

	@RequestMapping(value = "delEmp", method = RequestMethod.GET)
	public String deleteBook(HttpServletRequest request) {

		Integer id = Integer.parseInt(request.getParameter("id"));
		employeeService.delete(id);
		return "redirect:viewAll";
	}

	@RequestMapping(value = "updateEmp", method = RequestMethod.GET)
	public String updateEmp(HttpServletRequest request, ModelMap model) {

		Integer id = Integer.parseInt(request.getParameter("id"));
		Employee empToUpdate = employeeService.getEmployeeById(id);

		model.addAttribute("emp", empToUpdate);
		return "empform";
	}


	@ExceptionHandler(EmployeeNotFoundException.class)
	public ModelAndView handleEmployeeNotFoundException(HttpServletRequest request, Exception ex){
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("exception", ex);
	    modelAndView.addObject("url", request.getRequestURL());
	    
	    modelAndView.setViewName("error");
	    return modelAndView;
	}	
}