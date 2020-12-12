package Exc;

import TransferQuestion.TreatmentQuestion;
import com.opencsv.exceptions.CsvException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestSpring {
    public static void main(String[] args) throws IOException, CsvException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TreatmentQuestion TestRun = context.getBean(TreatmentQuestion.class);
        TestRun.run();
        context.close();
    }
}
