package controller;

import model.Patient;
import service.PatientService;
import view.PatientView;

import java.util.List;

public class PatientController {

        private final PatientService patientService;
        private final PatientView patientView;

        public PatientController() {
            patientService = new PatientService();
            patientView = new PatientView();
        }

        public void displayPatients() {

            List<Patient> patients =
                    patientService.getAllPatients();

            patientView.displayPatients(patients);
        }
}
