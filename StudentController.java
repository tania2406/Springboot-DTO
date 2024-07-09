package com.example.DTO.projection_example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository srepo;
	
	@GetMapping("/test")
	public String test()
	{
		return "This is demo projection test";
	}
	
	@PostMapping("/save")
	public String savedata(@RequestBody Student student)
	{
		srepo.save(student);
		return "Data Saved";
	}
	
	@GetMapping("/show")
	public List<Student> showdata()
	{
		return srepo.findAll();
	}
	
	@GetMapping("/{id}")
	public StudentDTO ById(@PathVariable int id)
	{
		return srepo.getById(id);
	}
	@GetMapping("/id/{id}")
	public StudentDTO2 idby(@PathVariable int id)
	{
		return srepo.getDetailById(id);
	}
	@GetMapping("/by/{id}")
	public StudentInterface id(@PathVariable int id)
	{
		return srepo.getInfoById(id);
	}
	
}
