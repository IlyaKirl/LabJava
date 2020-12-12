package TransferQuestion;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;

public interface TreatmentQuestion {
    void run() throws IOException, CsvValidationException;
}
