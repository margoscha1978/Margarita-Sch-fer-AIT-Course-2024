package lesson_32.ClassWork32;

public class Apartment implements Property {
    private String address; // адрес
    private int floor; // этаж
    private double area; // площадь в квадратных метрах
    private boolean hasElevator; // наличие лифта

    public Apartment(String address, int floor, double area, boolean hasElevator) {
        this.address = address;
        this.floor = floor;
        this.area = area;
        this.hasElevator = hasElevator;
    }

    @Override
    public double calculatePrice() {
        int pricePerSquareMeter = 1000; // цена за квадратный метр
        double price = pricePerSquareMeter * area;
        if (hasElevator) {
            price *= 1.05; //price = price * 1.05
        }
        return price;
    }

    @Override
    public void printDetails() {
        System.out.println("Apartment:");
        System.out.println("Address: " + address);
        System.out.println("Floor: " + floor);
        System.out.println("Area: " + area + " square meters");
        if (hasElevator) {
            System.out.println("Has elevator: Yes");
        } else {
            System.out.println("Has elevator: No");
        }
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }

    public double getArea() {
        return area;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }
} // klass ended
