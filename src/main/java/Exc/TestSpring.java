package Exc;

import TransferQuestion.TrQuestion;
import TransferQuestion.TreatmentQuestion;
import com.opencsv.exceptions.CsvException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestSpring {
    public static void main(String[] args) throws IOException, CsvException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TrQuestion trQuestion = context.getBean("TrQuestion", TrQuestion.class);
        TreatmentQuestion testAssemble = context.getBean("TreatmentQuestion", TreatmentQuestion.class);
        testAssemble.TestAssemble(trQuestion.getListQuestion());
        context.close();
    }
}
