package view;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import model.Patient;

import java.util.List;

    public class PatientView {

        public void displayPatients(List<Patient> patients) {

            try {

                ObjectMapper mapper = new ObjectMapper();

                mapper.registerModule(new JavaTimeModule());

                mapper.disable(
                        SerializationFeature.WRITE_DATES_AS_TIMESTAMPS
                );

                String json =
                        mapper.writerWithDefaultPrettyPrinter()
                                .writeValueAsString(patients);

                System.out.println(json);

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
}
