package business;

import java.time.LocalDate;

public class Reservation {
	//
	private static final double nightlyRate = 145.00;
	
	
	// instance variable
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public Reservation() {
		super();
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public String getArrivalDateFormatted() {
		String arrivalDateFormatted = "";
		return arrivalDateFormatted;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureDateFormatted() {
		String departureDateFormatted = "";
		return departureDateFormatted;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public static double getNightlyrate() {
		return nightlyRate;
	}
	
	
}
