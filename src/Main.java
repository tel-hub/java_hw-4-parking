import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static boolean validInteger(String str) {
        String regex = "^[0-9]*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.find();
    }

    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);
        System.out.print("Integer count >");

        int COUNT = 0;

        final String placesCount = KB.next();

        if (validInteger(placesCount)) {
            COUNT = Integer.parseInt(placesCount);
        }

        if (COUNT > 0) {
            System.out.println("### Total count " + COUNT + " ###");

            ParkingPlace[] allParkingPlaces;

            allParkingPlaces = new ParkingPlace[COUNT];

            for (int i = 0; i < COUNT; i++) {
                allParkingPlaces[i] = new ParkingPlace(i + 1);
                System.out.println(allParkingPlaces[i].toString());
            }

            allParkingPlaces[COUNT / 2].isOccupied = "занято";

            if (COUNT > 5) {
                allParkingPlaces[COUNT / 5].isOccupied = "занято";
            }

            System.out.println("### AFTER UPDATE ###");

            for (int i = 0; i < COUNT; i++) {
                System.out.println(allParkingPlaces[i].toString());
            }
        } else {
            System.out.println("NO DATA");
        }
    }
}
