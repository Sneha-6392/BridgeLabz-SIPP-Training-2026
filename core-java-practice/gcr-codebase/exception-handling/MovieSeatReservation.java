public class MovieSeatReservation {
    static int[] seats = {101, 102, 103, 104, 105};
    public static int getSeats(int idx) {
        try {
            return seats[idx];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position");
            return -1;
        }
    }
    public static void main(String[] args) {
        int seatNum = getSeats(8);
        if (seatNum != -1) {
            System.out.println("Seat Number: " + seatNum);
        } else {
            System.out.println("Seat not available.");
        } 
    }
}
