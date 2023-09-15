import java.util.Scanner;

public class chandrayan3craft {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Chandrayaan 3 Lunar Craft Control Program");
            System.out.print("Enter starting X coordinate: ");
            int x = sc.nextInt();
            System.out.print("Enter starting Y coordinate: ");
            int y = sc.nextInt();
            System.out.print("Enter starting Z coordinate: ");
            int z = sc.nextInt();
            sc.nextLine();  // Consume newline
            System.out.print("Enter initial direction (N, S, E, W, U, D): ");
            char initialDirection = sc.nextLine().charAt(0);
            spacecraft SpaceCraft = new spacecraft(x,y,z,initialDirection) ;

            while (true) {
                System.out.println("\nCurrent Position: " + SpaceCraft.getCurrentPosition());
                System.out.println("Current Direction: " + SpaceCraft.getCurrentDirection());
                System.out.println("Commands:");
                System.out.println("  f - Move forward");
                System.out.println("  b - Move backward");
                System.out.println("  l - Turn left");
                System.out.println("  r - Turn right");
                System.out.println("u - Turn up");
                System.out.println("d - down");
                System.out.println("  q - Quit");

                System.out.print("Enter a command: ");
                char command = sc.nextLine().charAt(0);
            switch (command) {
                case 'f':
                    SpaceCraft.moveForward();
                    break;
                case 'b':
                    SpaceCraft.moveBackward();
                    break;
                case 'l':
                  SpaceCraft.turnLeft();
                    break;
                case 'r':
                   SpaceCraft.turnRight();
                    break;
                case 'd':
                    SpaceCraft.turnDown();
                    break;
                case 'u':
                    SpaceCraft.turnUp();
                    break;
                case 'q':
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid command. Try again.");
            }
                System.out.println("Final Position: " + SpaceCraft.getCurrentPosition());
                System.out.println("Final Direction: " + SpaceCraft.getCurrentDirection());
        }
        }
    }
    

