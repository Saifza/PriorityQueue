package practices;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    private String name;
    private int priority; // Priority can be based on severity of the condition

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Patient other) {
        // Higher priority (lower value) comes first
        return Integer.compare(this.priority, other.priority);
    }
}

public class EmergencyRoom {
    public static void main(String[] args) {
        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>();

        // Adding patients to the emergency queue
        emergencyQueue.add(new Patient("John", 2)); // Priority 2 (less severe)
        emergencyQueue.add(new Patient("Alice", 1)); // Priority 1 (more severe)
        emergencyQueue.add(new Patient("Bob", 3)); // Priority 3 (least severe)

        // Treating patients based on priority
        while (!emergencyQueue.isEmpty()) {
            Patient currentPatient = emergencyQueue.poll();
            System.out.println("Treating patient: " + currentPatient.getName() + " (Priority: " + currentPatient.getPriority() + ")");
            // Perform treatment or further processing here
        }
    }
}
