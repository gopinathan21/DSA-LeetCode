import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> optionsList = new ArrayList<>();
    Passenger p;

    public void addOptions(String s) {
        optionsList.add(s);
    }

    public static ArrayList<Object> parseString(String s) {
        StringBuilder current = new StringBuilder();
        ArrayList<Object> parsed = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                parsed.add(current.toString().trim());
                current = new StringBuilder();
            } else {
                current.append(ch);
            }
        }
        if (current.length() > 0) {
            parsed.add(current.toString().trim());
        }

        if (parsed.size() >= 4) {
            try {
                int age = Integer.parseInt((String) parsed.get(1));
                parsed.remove(1);
                parsed.add(1, age);
            } catch (NumberFormatException e) {
                parsed.clear();
                throw e;
            }
            String gender = (String) parsed.get(2);
            String berth = (String) parsed.get(3);
            if (gender.toUpperCase().charAt(0) == 'M' || gender.toUpperCase().charAt(0) == 'F') {
                char ch = gender.charAt(0);
                parsed.remove(2);
                parsed.add(2, ch);
            }
            if (berth.toUpperCase().charAt(0) == 'L' || berth.toUpperCase().charAt(0) == 'M'
                    || berth.toUpperCase().charAt(0) == 'U') {
                char ch = berth.charAt(0);
                parsed.remove(3);
                parsed.add(3, ch);
            } else {
                System.out.println("Invalid");
            }
        }

        return parsed;
    }

    public static void main(String[] args) {
         
        

        Main m = new Main();
        m.addOptions("Book Ticket");
        m.addOptions("Cancel Ticket");
        m.addOptions("Print Booked Ticekts");
        System.out.println("Gopi Train Ticket Booking system");
        while (true) {
            Scanner sc = new Scanner(System.in);
            for (int i = 1; i <= optionsList.size(); i++) {
                System.out.println(i + " " + optionsList.get(i - 1));
            }
            int option;
            try{
                 option = sc.nextInt();
            }
            catch(Exception e)
            {
                sc.nextLine();
                continue;
            }
            
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Add the passenger details: Name , age , Char gender , Char Berth Preference");
                    String pDetails = sc.nextLine();
                    ArrayList<Object> parse = parseString(pDetails);
                    String name = (String) parse.get(0);
                    int age = (int) parse.get(1);
                    char gender = (char) parse.get(2);
                    char preference = (char) parse.get(3);
                    Passenger p = new Passenger(name, age, gender, preference);
                    p.bookTicket();
                    break;
                case 2:
                    System.out.println("You are about to cancel the ticket");
                    break;
                case 3:
                    System.out.println("You are going to print booked tickets");
                    Passenger.printTickets();
                default:
                    break;
            }
        }
    }
}
