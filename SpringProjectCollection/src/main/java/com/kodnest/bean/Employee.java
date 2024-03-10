package com.kodnest.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Employee {
	ArrayList<String> technologies;
	HashSet<String> projects;
	HashMap<Integer, String> organisations;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(ArrayList<String> technologies, HashSet<String> projects, HashMap<Integer, String> organisations) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		this.organisations = organisations;
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	public HashSet<String> getProjects() {
		return projects;
	}
	public void setProjects(HashSet<String> projects) {
		this.projects = projects;
	}
	public HashMap<Integer, String> getOrganisations() {
		return organisations;
	}
	public void setOrganisations(HashMap<Integer, String> organisations) {
		this.organisations = organisations;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", projects=" + projects + ", organisations=" + organisations
				+ "]";
	}
	

}
