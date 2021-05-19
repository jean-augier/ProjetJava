package com.polyjava.poo;

public class Planning {

	private Time Jour_planning;

	private Time Heure_planning;

	private String Type_travail;
	
	public Planning(String type_travail) {
		super();
		Type_travail = type_travail;
	}

	public Planning(Time jour_planning, Time heure_planning) {
		super();
		Jour_planning = jour_planning;
		Heure_planning = heure_planning;
	}

	public Time getJour_planning() {
		return Jour_planning;
	}

	public void setJour_planning(Time jour_planning) {
		Jour_planning = jour_planning;
	}

	public Time getHeure_planning() {
		return Heure_planning;
	}

	public void setHeure_planning(Time heure_planning) {
		Heure_planning = heure_planning;
	}

	public String getType_travail() {
		return Type_travail;
	}

	public void setType_travail(String type_travail) {
		Type_travail = type_travail;
	}
	
	
}
