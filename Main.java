import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicOrganizer organizer = new MusicOrganizer();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n--- Music Organizer Menu ---");
            System.out.println("1. Add a file");
            System.out.println("2. List all files");
            System.out.println("3. Play a file");
            System.out.println("4. Remove a file");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the file (e.g., song.mp3): ");
                    String filename = scanner.nextLine();
                    organizer.addFile(filename);
                    System.out.println(filename + " has been added.");
                    break;
                case 2:
                    System.out.println("Listing all files:");
                    organizer.listAllFiles();
                    break;
                case 3:
                    System.out.print("Enter the index of the file to play: ");
                    int playIndex = scanner.nextInt();
                    organizer.startPlaying(playIndex);
                    break;
                case 4:
                    System.out.print("Enter the index of the file to remove: ");
                    int removeIndex = scanner.nextInt();
                    organizer.removeFile(removeIndex);
                    System.out.println("File removed.");
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
