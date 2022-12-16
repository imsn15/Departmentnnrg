package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="NNRG_DEPARTMENT")
public class Department {

	@Id
	public String id;
	public String depId;
	public String depName;
	public String manId;
	public String locId;
	public Department(String id, String depId, String depName, String manId, String locId) {
		super();
		this.id = id;
		this.depId = depId;
		this.depName = depName;
		this.manId = manId;
		this.locId = locId;
	}
	
	
	
}
