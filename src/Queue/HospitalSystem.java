package Queue;

import java.util.HashMap;
import java.util.PriorityQueue;

class Patient{
    String name;
    int priority;
    long arrivalTime;

    public Patient(String name, int priority, long arrivalTime){
        this.name = name;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
    }
}
public class HospitalSystem {
    PriorityQueue <Patient> queue;
    HashMap<String, Patient> patientMap;

    public HospitalSystem(){
        queue = new PriorityQueue<>(
                (a,b) -> a.priority != b.priority ? b.priority - a.priority : (int)(a.arrivalTime - b.arrivalTime)
        );
        patientMap = new HashMap<>();
    }

    public void addPatient(String name, int priority){
        if (patientMap.containsKey(name)){
            Patient patient = patientMap.get(name);
            if (priority > patient.priority){
                queue.remove(patient);
                patient.priority = priority;
                queue.add(patient);
            }
        }else{
            Patient patient = new Patient(name, priority, System.currentTimeMillis());
            queue.add(patient);
            patientMap.put(name, patient);
        }
    }

    public String nextPatient(){
        if (queue.isEmpty()){
            return "No patient";
        }else{
            Patient patient = queue.poll();
            patientMap.remove(patient.name);
            return patient.name;
        }
    }

    public String peekPatient(){
        return queue.isEmpty() ? "No Patient" : queue.peek().name;
    }

    public void removePatient(String name){
        if (patientMap.containsKey(name)){
            Patient patient = patientMap.get(name);
            queue.remove(patient);
            patientMap.remove(name);
        }
    }
}
