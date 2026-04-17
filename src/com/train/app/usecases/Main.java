import java.util.ArrayList;
import java.util.List;

class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("===================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===================================");

        // Initialize dynamic list for train bogies
        List<String> trainConsist = new ArrayList<>();

        // Confirmation message
        System.out.println("\nTrain initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist: " + trainConsist);

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}