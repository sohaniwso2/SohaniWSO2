package org.axis.customer;

public class TicketReservation {

	private String customerID;
	private String requestID;
	private String movieName;
	private int noOfRequestedSeats;
	private int rowNumber;
	private int noOfBookedSeats;
	private String request;
	private String confirm;

	public void setCustomerRequest(String customerID, String requestID,
			String movieName, int noOfRequestedSeats) {
		this.customerID = customerID;
		this.requestID = requestID;
		this.movieName = movieName;
		this.noOfRequestedSeats = noOfRequestedSeats;
	}

	public String getCustomerRequest() {
		return request;

	}

	public void setConfirmation(String requestID, int rowNumber,
			int noOfBookedSeats) {
		this.requestID = requestID;
		this.rowNumber = rowNumber;
		this.noOfBookedSeats = noOfBookedSeats;
	}

	public String getConfirmaiton() {
		return confirm;
	}
}
