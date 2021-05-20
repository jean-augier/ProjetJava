package com.polyjava.poo;

import java.time.LocalTime;

public class Planning {

	private String Jour_planning;

	private LocalTime Heure_Debut;
	
	private LocalTime Heure_Fin;

	private String Type_travail;

	public Planning(String jour_planning, LocalTime heure_Debut, LocalTime heure_Fin, String type_travail) {
		super();
		Jour_planning = jour_planning;
		Heure_Debut = heure_Debut;
		Heure_Fin = heure_Fin;
		Type_travail = type_travail;
	}

	public String getJour_planning() {
		return Jour_planning;
	}

	public void setJour_planning(String jour_planning) {
		Jour_planning = jour_planning;
	}

	public LocalTime getHeure_Debut() {
		return Heure_Debut;
	}

	public void setHeure_Debut(LocalTime heure_Debut) {
		Heure_Debut = heure_Debut;
	}

	public LocalTime getHeure_Fin() {
		return Heure_Fin;
	}

	public void setHeure_Fin(LocalTime heure_Fin) {
		Heure_Fin = heure_Fin;
	}

	public String getType_travail() {
		return Type_travail;
	}

	public void setType_travail(String type_travail) {
		Type_travail = type_travail;
	}

	@Override
	public String toString() {
		return "Planning [Jour_planning=" + Jour_planning + ", Heure_Debut=" + Heure_Debut + ", Heure_Fin=" + Heure_Fin
				+ ", Type_travail=" + Type_travail + "]";
	}
}
