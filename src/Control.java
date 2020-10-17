import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        var rocket = new Rocket();
        var scanner = new Scanner(System.in);
        System.out.println("Chose level 1, 2 or 3? ");
        switch (scanner.nextInt()) {
            case 1:
                rocket.fuel = 90;
                rocket.height = 50;
                rocket.speed = 8;
                break;
            case 2:
                rocket.fuel = 130;
                rocket.height = 150;
                rocket.speed = 14;
                break;
            case 3:
                rocket.fuel = 350;
                rocket.height = 1000;
                rocket.speed = 25;
                break;
            default:
                rocket.fuel = 90;
                rocket.height = 50;
                rocket.speed = 8;
        }
        while (rocket.height > 0) {
            System.out.print(String.format(
                    "Height: %5.1f Speed: %5.1f Fuel: %5.1f Power? ",
                    rocket.height, rocket.speed,rocket.fuel));
            rocket.set(scanner.nextInt());
        }
        System.out.println(String.format(
                "Height: %5.1f Speed: %5.1f Fuel: %5.1f Landing.",
                rocket.height, rocket.speed,rocket.fuel));
        if (rocket.speed < 2) {
            System.out.println("Very well");
        } else if (rocket.speed < 4) {
            System.out.println("Not bad");
        } else if (rocket.speed < 6) {
            System.out.println("Destroyed");
        } else {
            System.out.println("New crater on Moon");
        }
    }
}
