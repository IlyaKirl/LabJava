package TransferQuestion;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrQuestionImpl implements TrQuestion {

    public List<String> getListQuestion() throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(this.getClass().getClassLoader().getResource("Excel.csv").getPath()));
        String[] nextLine;
        List<String> ListQuestion = new ArrayList<>(10);
        int i = 0;
        while ((nextLine = reader.readNext()) != null) {
            ListQuestion.add(i, nextLine[0]);
            i++;
        }
        return ListQuestion;
    }

}
