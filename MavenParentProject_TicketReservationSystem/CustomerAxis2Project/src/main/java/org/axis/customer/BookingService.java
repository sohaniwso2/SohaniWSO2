package org.axis.customer;

public class BookingService {

	public TicketReservation createrequest(String customerID, String requestID,
			String movieName, int noOfRequestedSeats) {
		TicketReservation request = new TicketReservation();
		request.setCustomerRequest(customerID, requestID, movieName,
				noOfRequestedSeats);
		return request;
	}

	public TicketReservation createconfirmation(String requestID,
			int rowNumber, int noOfBookedSeats) {
		TicketReservation confirm = new TicketReservation();
		confirm.setConfirmation(requestID, rowNumber, noOfBookedSeats);
		return confirm;
	}

}
