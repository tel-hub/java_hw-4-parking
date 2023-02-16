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

    static void printData(ParkingPlace[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ParkingPlace(i + 1);
            System.out.println(arr[i].toString());
        }
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

            ParkingPlace[] allParkingPlaces = new ParkingPlace[COUNT];

            for (int i = 0; i < COUNT; i++) {
                allParkingPlaces[i] = new ParkingPlace(i + 1);
            }

            printData(allParkingPlaces);

            allParkingPlaces[COUNT / 2].isOccupied = "занято";

            if (COUNT > 5) {
                allParkingPlaces[COUNT / 5].isOccupied = "занято";
            }

            System.out.println("### AFTER UPDATE ###");

            printData(allParkingPlaces);

        } else {
            System.out.println("NO DATA");
        }
    }
}
