package com.model;

public interface Frontend {

	public static final Double WEB_API_DB_COST = 2200.0;
	public static final Double BE_MAINTENACE_COST = 500.0;
	
	public double createWebAPIandDBConnectionCost();
	
	public double maintenanceCost();
	
}
