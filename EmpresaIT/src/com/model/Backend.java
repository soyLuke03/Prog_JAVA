package com.model;

public interface Backend {

	public static final Double WEB_INTERFACE_DESIGN_COST = 2100.0;
	public static final Double FE_MAINTENANCE_COST = 700.0;
	
	
	public double computeWebDesignCost();
	public double computerFEMaintencanceCost();
}
