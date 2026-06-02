import controller.PatientController;

public class PAMSApp {

        public static void main(String[] args) {

            PatientController controller =
                    new PatientController();

            controller.displayPatients();
        }
}
