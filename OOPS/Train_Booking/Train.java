import java.util.ArrayList;

public class Train {
    private static  int TotalSeats = 5;

    private static int upper  = TotalSeats / 3;
    private static int middle  = (TotalSeats - upper) / 2;
    private static int lower = TotalSeats - (upper + middle);

    static ArrayList<Passenger> passengersList = new ArrayList<>();

    public char bookSeat(char preference) {
        char booked = 'N';

        // Try to book the preferred seat type
        switch (preference) {
            case 'U':
                booked = bookPreferred('U', 'M', 'L'); // Try to book Upper, then Middle, then Lower
                break;
            case 'M':
                booked = bookPreferred('M', 'U', 'L'); // Try to book Middle, then Upper, then Lower
                break;
            case 'L':
                booked = bookPreferred('L', 'M', 'U'); // Try to book Lower, then Middle, then Upper
                break;
        }

        return booked;
    }

    // Helper method to book preferred seat type or fallback to alternatives
    private char bookPreferred(char preferred, char fallback1, char fallback2) {
        if (canBook(preferred)) {
            decreaseCount(preferred);
            return preferred;
        } else if (canBook(fallback1)) {
            decreaseCount(fallback1);
            return fallback1;
        } else if (canBook(fallback2)) {
            decreaseCount(fallback2);
            return fallback2;
        } else {
            return 'N'; // No seats available
        }
    }

    // Check if there are available seats for the given type
    private boolean canBook(char type) {
        switch (type) {
            case 'U':
                return upper > 0;
            case 'M':
                return middle > 0;
            case 'L':
                return lower > 0;
            default:
                return false;
        }
    }

    // Decrease seat count for the given type
    private void decreaseCount(char type) {
        TotalSeats--;
        switch (type) {
            case 'U':
                upper--;
                break;
            case 'M':
                middle--;
                break;
            case 'L':
                lower--;
                break;
        }
    }
}
