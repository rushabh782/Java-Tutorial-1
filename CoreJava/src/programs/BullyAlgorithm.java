package programs;
import java.util.Scanner;

class Process {
    int id;
    boolean active;

    public Process(int id) {
        this.id = id;
        this.active = true;
    }
}

public class BullyAlgorithm {
    private static Process[] processes;
    private static int coordinatorId;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();
        processes = new Process[n];

        for (int i = 0; i < n; i++) {S
            processes[i] = new Process(i + 1); // Assign process IDs starting from 1
        }

        coordinatorId = n; // Initially, highest ID process is the coordinator

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Hold an Election");
            System.out.println("2. Kill Coordinator");
            System.out.println("3. Recover a Process");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter process initiating election: ");
                    int initiator = scanner.nextInt();
                    holdElection(initiator - 1);
                    break;
                case 2:
                    System.out.println("Coordinator Process " + coordinatorId + " is down.");
                    processes[coordinatorId - 1].active = false;
                    coordinatorId = -1;
                    break;
                case 3:
                    System.out.print("Enter process to recover: ");
                    int recoverId = scanner.nextInt();
                    recoverProcess(recoverId - 1);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void holdElection(int initiator) {
        System.out.println("Election started by Process " + (initiator + 1));
        int newCoordinator = -1;

        for (int i = initiator + 1; i < processes.length; i++) {
            if (processes[i].active) {
                System.out.println("Process " + (initiator + 1) + " sends election message to Process " + (i + 1));
                newCoordinator = i;
            }
        }

        if (newCoordinator == -1) {
            System.out.println("No higher process is active. Process " + (initiator + 1) + " becomes coordinator.");
            coordinatorId = initiator + 1;
        } else {
            System.out.println("Process " + (newCoordinator + 1) + " takes over and starts a new election.");
            holdElection(newCoordinator);
        }
    }

    private static void recoverProcess(int id) {
        if (!processes[id].active) {
            processes[id].active = true;
            System.out.println("Process " + (id + 1) + " has recovered.");
            holdElection(id);
        } else {
            System.out.println("Process " + (id + 1) + " is already active.");
        }
    }
}
