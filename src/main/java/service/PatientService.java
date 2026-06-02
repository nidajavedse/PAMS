package service;

import model.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PatientService {
    public List<Patient> getAllPatients() {

        List<Patient> patients = new ArrayList<>();

        patients.add(
                new Patient(
                        1,
                        "Daniel",
                        "Agar",
                        "(641) 123-0009",
                        "dagar@m.as",
                        "1 N Street",
                        LocalDate.of(1987,1,19)
                )
        );

        patients.add(
                new Patient(
                        2,
                        "Ana",
                        "Smith",
                        "",
                        "asmith@te.edu",
                        "",
                        LocalDate.of(1948,12,5)
                )
        );

        patients.add(
                new Patient(
                        3,
                        "Marcus",
                        "Garvey",
                        "(123) 292-0018",
                        "",
                        "4 East Ave",
                        LocalDate.of(2001,9,18)
                )
        );

        patients.add(
                new Patient(
                        4,
                        "Jeff",
                        "Goldbloom",
                        "(999) 165-1192",
                        "jgold@es.co.za",
                        "",
                        LocalDate.of(1995,2,28)
                )
        );

        patients.add(
                new Patient(
                        5,
                        "Mary",
                        "Washington",
                        "",
                        "",
                        "30 W Burlington",
                        LocalDate.of(1932,5,31)
                )
        );

        patients.sort(
                Comparator.comparing(Patient::getAge)
                        .reversed()
        );

        return patients;
    }
}
