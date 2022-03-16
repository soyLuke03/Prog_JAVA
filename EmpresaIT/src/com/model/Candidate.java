package com.model;

import java.time.LocalDateTime;

public abstract class Candidate implements Comparable<Candidate> {

	private LocalDateTime dateOfBirth;
	private LocalDateTime startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	
	//Builder
	
	public Candidate() {
		
	}
	
	
	//Methods
	
	public abstract double computeGrossSalary();
	
	public boolean isInProject() {
		
		return false;
	}
	
}
