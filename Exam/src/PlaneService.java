import java.util.Scanner;

public class PlaneService {
    public Plane create() {
        Scanner in = new Scanner(System.in);
        Plane plane = new Plane();

        System.out.println("Please enter plane model:");
        plane.setModel(in.next());

        System.out.println("Please enter plane country:");
        plane.setCountry(in.next());

        System.out.println("Please enter plane year(1903-2020):");

        while (true) {
            short year = in.nextShort();
            if (year < 1903 || year > 2020) {
                System.out.println("Year shoud be in range from 1903 to 2020. Please reenter:");
            } else {
                plane.setYear(year);
                break;
            }
        }

        System.out.println("Please enter plane flight hours(0-10000)");
        while (true) {
            short hour = in.nextShort();
            if (hour < 0 || hour > 10000) {
                System.out.println("Year should be in range from 0 to 10000. Please reenter:");
            } else {
                plane.setHours(hour);
                break;
            }
        }

        System.out.println("Please enter plane is military or not(y/n)");
        while (true) {
            char isMilitary = in.next().toLowerCase().charAt(0);
            if (isMilitary != 'y' && isMilitary != 'n') {
                System.out.println("Unknown answer. Please reenter Y/y or N/n:");
            } else {
                plane.setMilitary(isMilitary == 'y');
                break;
            }
        }

        System.out.println("Please enter plane weight(1000-160000)");
        while (true) {
            int weight = in.nextInt();
            if (weight < 1000 || weight > 160000) {
                System.out.println("Weight should be in range from 1000 to 160000. Please reenter:");
            } else {
                plane.setWeight(weight);
                break;
            }
        }

        System.out.println("Please enter plane speed(Speed should be non negative value)");
        while (true) {
            short speed = in.nextShort();
            if (speed < 0) {
                System.out.println("Speed should not be negative value. Please reenter:");
            } else {
                plane.setTopSpeed(speed);
                break;
            }
        }

        System.out.println("Please enter plane seats quantity(Seats quantity should be non negative value)");
        while (true) {
            short seats = in.nextShort();
            if (seats < 0) {
                System.out.println("Seats quantity should not be negative value. Please reenter:");
            } else {
                plane.setSeats(seats);
                break;
            }
        }

        System.out.println("Please enter plane price(Price should be non negative value)");
        while (true) {
            float cost = in.nextFloat();
            if (cost < 0) {
                System.out.println("Seats quantity should not be negative value. Please reenter:");
            } else {
                plane.setCost(cost);
                break;
            }
        }

        return plane;
    }

    public void printInfo(Plane plane) {
        System.out.println(plane.isMilitary() ? plane.getCost() + " " + plane.getTopSpeed() : plane.getModel() + " " + plane.getCountry());
    }

    public Plane newestPlane(Plane plane1, Plane plane2) {
        return plane1.getYear() >= plane2.getYear() ? plane1 : plane2;
    }

    public void smallestCountOfSeats(Plane plane1, Plane plane2, Plane plane3) {
        Plane planeWithSmallestSeats = plane1;

        if (planeWithSmallestSeats.getSeats() > plane2.getSeats()) {
            planeWithSmallestSeats = plane2;
        }

        if (planeWithSmallestSeats.getSeats() > plane3.getSeats()) {
            planeWithSmallestSeats = plane3;
        }

        System.out.println(planeWithSmallestSeats.getCountry());
    }

    public void notMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                System.out.println(plane);
            }
        }
    }

    public void militaryPlanesMoreHundredHours(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                System.out.println(plane);
            }
        }
    }

    public Plane lightestPlane(Plane[] planes) {
        Plane lightestPlane = null;

        for (Plane plane : planes) {
            if (lightestPlane == null) {
                lightestPlane = plane;
            } else if (lightestPlane.getWeight() >= plane.getWeight()) {
                lightestPlane = plane;
            }
        }

        return lightestPlane;
    }

    public Plane cheapestMilitaryPlane(Plane[] planes) {
        Plane cheapestPlane = null;

        for (Plane plane : planes) {
            if (plane.isMilitary()) {
                if (cheapestPlane == null) {
                    cheapestPlane = plane;
                } else if (cheapestPlane.getCost() > plane.getCost()) {
                    cheapestPlane = plane;
                }
            }
        }

        return cheapestPlane;
    }

    public void sortByYear(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() > planes[j].getYear()) {
                    Plane tempPlane = planes[j];
                    planes[j] = planes[i];
                    planes[i] = tempPlane;
                }
            }
        }

        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }
}
