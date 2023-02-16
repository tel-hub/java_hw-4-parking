public class ParkingPlace {
    int number;
    String isOccupied = "не занято";

    public ParkingPlace(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "number=" + number +
                ", isOccupied='" + isOccupied + '\'' +
                '}';
    }
}
