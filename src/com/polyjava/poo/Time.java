package com.polyjava.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {

	private LocalDate date;

	private LocalTime hour;

	public Time() {
		date = LocalDate.now();
		hour = LocalTime.now();
	}

	public Time(LocalTime hour) {
		date = LocalDate.now();
		this.hour = hour;
	}

	public Time(LocalDate date) {
		this.date = date;
		hour = LocalTime.now();
	}

	public Time(LocalTime hour, LocalDate date ) {
		this.date = date;
		this.hour = hour;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getHour() {
		return hour;
	}

	public LocalTime getRoundedHour() {
		return this.getRoundedHour(this.hour);
	}

	public LocalTime getRoundedHour(LocalTime hour) {
		int newMinute = hour.getMinute();
		int newHour = hour.getHour();
		LocalTime rounded;
		
		if (newMinute > 0 && newMinute < 15) {
			if (newMinute >= 8)
				newMinute = 15;
			else
				newMinute = 0;
		}else if (newMinute > 15 && newMinute < 30) {
			if (newMinute >= 23)
				newMinute = 30;
			else
				newMinute = 15;
		}else if (newMinute > 30 && newMinute < 45) {
			if (newMinute >= 38)
				newMinute = 45;
			else
				newMinute = 30;
		}else if (newMinute > 45 && newMinute <= 59) {
			if (newMinute >= 53) {
				newMinute = 0;
				newHour += 1; 
			}else
				newMinute = 45;
		}
		
		rounded = LocalTime.of(newHour, newMinute);
		
		return rounded;
	}

	public void setHour(LocalTime hour) {
		this.hour = hour;
	}

	public String toString() {
		return hour.getHour() + ":" + hour.getMinute() + ", rounded : " + getRoundedHour(getHour()).getHour() + ":" + getRoundedHour(getHour()).getMinute() + ", date : " + date.toString();
	}

}
