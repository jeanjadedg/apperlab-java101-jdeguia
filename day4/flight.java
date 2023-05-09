package flight;

public class flight {

    public int seats;
    public int passengers;

    public flight() {
        seats = 10;
        passengers = 0;
    }


    public void addPassengers()  {
       if (seats != 0) {
           passengers++;
           seats--;
       } else {
           System.out.println("Seats are all booked.");
       }

    }
    public void addSeats(int seats) {
        this.seats = seats - 10;
    }
}
