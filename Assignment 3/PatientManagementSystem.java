package Exam;

import java.util.*;

// Patient class
class Patient {
    private int patientId;
    private String name;
    private String diagnosis;
    private int daysAdmitted;

    public Patient(int patientId, String name, String diagnosis, int daysAdmitted) {
        this.patientId = patientId;
        this.name = name;
        this.diagnosis = diagnosis;
        this.daysAdmitted = daysAdmitted;
    }

    // Getters
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public String getDiagnosis() { return diagnosis; }
    public int getDaysAdmitted() { return daysAdmitted; }

    @Override
    public String toString() {
        return "PatientID: " + patientId + ", Name: " + name +
               ", Diagnosis: " + diagnosis + ", Days Admitted: " + daysAdmitted;
    }
}

// Patient Management System
class PatientDatabase {
    private Map<Integer, Patient> patients = new HashMap<>();

    // a. Add a new patient
    public void addPatient(Patient patient) {
        patients.put(patient.getPatientId(), patient);
        System.out.println("Patient added: " + patient.getName());
    }

    // b. Remove a patient by ID
    public void removePatient(int patientId) {
        Patient removed = patients.remove(patientId);
        if (removed != null) {
            System.out.println("Patient removed: " + removed.getName());
        } else {
            System.out.println("Patient ID not found.");
        }
    }

    // c. Find all patients with a specific diagnosis
    public List<Patient> findByDiagnosis(String diagnosis) {
        List<Patient> result = new ArrayList<>();
        for (Patient p : patients.values()) {
            if (p.getDiagnosis().equalsIgnoreCase(diagnosis)) {
                result.add(p);
            }
        }
        return result;
    }

    // d. Find all patients admitted for more than given days
    public List<Patient> findByDaysAdmitted(int minDays) {
        List<Patient> result = new ArrayList<>();
        for (Patient p : patients.values()) {
            if (p.getDaysAdmitted() > minDays) {
                result.add(p);
            }
        }
        return result;
    }
}

// Test class
public class PatientManagementSystem {
    public static void main(String[] args) {
        PatientDatabase db = new PatientDatabase();

        // Adding patients
        db.addPatient(new Patient(101, "Alice", "Flu", 3));
        db.addPatient(new Patient(102, "Bob", "Covid-19", 10));
        db.addPatient(new Patient(103, "Charlie", "Flu", 7));
        db.addPatient(new Patient(104, "Diana", "Diabetes", 15));

        // Removing a patient
        db.removePatient(103);

        // Finding patients by diagnosis
        System.out.println("\nPatients with Flu:");
        for (Patient p : db.findByDiagnosis("Flu")) {
            System.out.println(p);
        }

        // Finding patients admitted for more than 5 days
        System.out.println("\nPatients admitted more than 5 days:");
        for (Patient p : db.findByDaysAdmitted(5)) {
            System.out.println(p);
        }
    }
}
