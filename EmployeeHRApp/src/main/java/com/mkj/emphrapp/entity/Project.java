package com.mkj.emphrapp.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Project {

	@Value("My New Bank App")
	private String projectName;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + "]";
	}
	
	
}
