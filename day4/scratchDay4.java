import flight.flight;

public class scratchDay4 {

    public static void main(String[] args) {
        flight manilaToBoracay = new flight();
        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();

        manilaToBoracay.addSeats(20);

        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();
        manilaToBoracay.addPassengers();

        System.out.println("Current number of passengers: " + manilaToBoracay.passengers);
        System.out.println("Current number of seats: " + manilaToBoracay.seats);



    }
}