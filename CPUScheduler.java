package practices;

import java.util.PriorityQueue;

class Process implements Comparable<Process> {
    private String name;
    private int priority;

    public Process(String name, int priority) {
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
    public int compareTo(Process other) {
        // Higher priority (lower value) comes first
    	
        return Integer.compare(this.priority, other.priority);
    }
}

public class CPUScheduler {
    public static void main(String[] args) {
        PriorityQueue<Process> processQueue = new PriorityQueue<>();

        // Adding processes to the queue
        processQueue.add(new Process("Process X", 3)); // Priority 2
        processQueue.add(new Process("Process Y", 1)); // Priority 1
        processQueue.add(new Process("Process Z", 2)); // Priority 3

        // Executing processes based on priority
        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();
            System.out.println("Executing process: " + currentProcess.getName() + " (Priority: " + currentProcess.getPriority() + ")");
            // Simulate CPU execution of the process here
           
        }
        
       
    }
}
