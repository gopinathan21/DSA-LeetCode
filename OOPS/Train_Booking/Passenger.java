import java.util.ArrayList;

public class Passenger {
    String name;
    int age;
    char g;
    char preffered;
    static int id;
    static ArrayList<Passenger> passengersList = new ArrayList<>();

    Passenger(String name, int age, char g, char preffered) {
        this.name = name;
        this.age = age;
        this.g = g;
        this.preffered = preffered;
    }

    public boolean bookTicket() {
        Train newTrain = new Train();
        char booked = newTrain.bookSeat(this.preffered);
        if (booked != 'N') {
            this.preffered = booked;
            Passenger.id += 1;
            passengersList.add(this);
            return true;
        }
        return false;
    }

    static void printTickets() {
        if (passengersList.size() != 0) {
            for (Passenger p : passengersList) {
                System.out.println(p.name + " " + p.age + " " + p.preffered);
            }
        } else {
            System.out.println("No tickets booked yet");
        }
    }
}
