import java.util.Scanner;

public class RoomDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of Room1:");
        int height1 = sc.nextInt();
        int width1 = sc.nextInt();
        int breadth1 = sc.nextInt();
        System.out.println("Enter the dimensions of Room2:");
        int height2 = sc.nextInt();
        int width2 = sc.nextInt();
        int breadth2 = sc.nextInt();
        Room room1 = new Room(height1, width1, breadth1);
        Room room2 = new Room(height2, width2, breadth2);
        int volume1 = room1.calculateVolume();
        int volume2 = room2.calculateVolume();
        System.out.println("Volume of Room1: " + volume1);
        System.out.println("Volume of Room2: " + volume2);
    }
}

class Room {
    int height;
    int width;
    int breadth;

    Room(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    int calculateVolume() {
        return height * width * breadth;
    }
}