package queue;

import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}
public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
        pq.add(new Patient("A", 2));
        pq.add(new Patient("B", 5));
        pq.add(new Patient("C", 1));
        pq.add(new Patient("D", 4));
        if (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " " + p.severity);
        }
    }
}
