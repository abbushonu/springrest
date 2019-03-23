package com.securifi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.securifi.beans.Employee;
import com.securifi.dao.Employeedao;

@Controller
public class EmployeeController {
	@Autowired
	Employeedao dao;

	@RequestMapping("/")
	public String howle() {
		System.out.println("hi u are in controller howle method");
		return "index";
	}

	@RequestMapping(value = "/empform")
	public String showForm(Model m) {
		m.addAttribute("command", new Employee());

		return "empform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employee emp) {
		System.out.println("save method invoked");
		dao.save(emp);
		return "redirect:/viewemp";
	}

	@RequestMapping(value = "/viewemp")
	public List getAllEmployes() {
		System.out.println("view all");
		List<Employee> list = dao.getAllEmployes();
		return list;
	}
}
