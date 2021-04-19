import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isMenuActive = true;

        PlaneService service = new PlaneService();
        Plane plane1 = service.create();
        Plane plane2 = service.create();
        Plane plane3 = service.create();
        Plane[] planes = {plane1, plane2, plane3};

        while (isMenuActive) {
            System.out.println("Please choose a function which you want to run. (1 - 8)");
            System.out.println("1) Print cost and top speed if the plane is military otherwise print model and country");
            System.out.println("2) Return the plane which one is newer (if they have the same age return first one).");
            System.out.println("3) Print country of the plane with smallest seats count (if they have the same - print first).");
            System.out.println("4) Print all not military planes.");
            System.out.println("5) Print all military planes which were in air more than 100 hours.");
            System.out.println("6) Return the plane with minimal weight (if there are some of them return last one).");
            System.out.println("7) Return the plane with minimal cost from all military planes (if there are some of them return first one).");
            System.out.println("8) Print planes in ascending form order by year");
            System.out.println("Any other to exit");

            byte choice = in.nextByte();

            switch (choice) {
                case 1:
                    service.printInfo(plane1);
                    break;
                case 2:
                    System.out.println(service.newestPlane(plane1, plane2));
                    break;
                case 3:
                    service.smallestCountOfSeats(plane1, plane2, plane3);
                    break;
                case 4:
                    service.notMilitaryPlanes(planes);
                    break;
                case 5:
                    service.militaryPlanesMoreHundredHours(planes);
                    break;
                case 6:
                    System.out.println(service.lightestPlane(planes));
                    break;
                case 7:
                    System.out.println(service.cheapestMilitaryPlane(planes));
                    break;
                case 8:
                    service.sortByYear(planes);
                    break;
                default:
                    isMenuActive = false;
                    break;
            }
        }
    }
}
