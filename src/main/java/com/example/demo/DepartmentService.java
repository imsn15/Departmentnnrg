package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	public DepartmentRepository depRepo;
	
	public Department create(Department dep) {
		return depRepo.save(dep);
	}
	
	
	public List<Department> getAll(){
		return depRepo.findAll();
	}
	
	public Optional<Department> getById(String id){
		return depRepo.findById(id);
	}
	
	public Department update(String id,Department dep) {
		dep.setId(id);
		return depRepo.save(dep);
	}
	
	
	public String delete(String id) {
		depRepo.deleteById(id);
		return "Department with id : " + id + " deleted successfully.";
	}
}
