import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC1: Initialization Complete");

        // ================= UC2 =================
        System.out.println("\n===============================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("===============================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // REMOVE bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // CHECK existence
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        // Final list
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");

        // ================= UC3 =================
        System.out.println("\n===============================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===============================\n");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // ADD IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");

        // Duplicate entries (should be ignored)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);

        // ================= UC4 =================
        System.out.println("\n===============================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===============================\n");

        // Create LinkedList for train consist
        LinkedList<String> orderedConsist = new LinkedList<>();

        orderedConsist.add("Engine");
        orderedConsist.add("Sleeper");
        orderedConsist.add("AC");
        orderedConsist.add("Cargo");
        orderedConsist.add("Guard");

        orderedConsist.add(2, "Pantry Car");

        System.out.println("After adding bogies and Pantry Car:");
        System.out.println(orderedConsist);

        orderedConsist.removeFirst();
        orderedConsist.removeLast();

        System.out.println("\nFinal Train Consist:");
        System.out.println(orderedConsist);

        // ================= UC5 =================
        System.out.println("\n===============================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===============================\n");

        // Create LinkedHashSet
        Set<String> formation = new LinkedHashSet<>();

        // ADD bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Add duplicate intentionally
        formation.add("Sleeper");  // should be ignored

        // Display formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);


        // ================= UC6 =================
        System.out.println("\n===============================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("===============================\n");

        // Create HashMap
        Map<String, Integer> capacityMap = new HashMap<>();

        // ADD bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 50);
        capacityMap.put("First Class", 24);

        // Display all entries
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " seats");
        }

        // ================= UC7 =================
        System.out.println("\n===============================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("===============================\n");

        // Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 50));
        bogieList.add(new Bogie("First Class", 24));

        // Display before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " → " + b.capacity);
        }

        // Sort using Comparator (lambda)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting (by capacity):");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " → " + b.capacity);
        }
    }
}