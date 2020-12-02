package TransferQuestion;
import java.util.List;
import java.util.Scanner;

public class TreatmentQuestion {

    public void TestAssemble(List<String> ListQuestion) {
        int CountCorrectAnswer = 0;
        int CountInorrectAnswer = 0;
        boolean CheckCorrectAnswer = false;

        for(int i = 0;i<ListQuestion.size();i++) {
            String StrQuestion = ListQuestion.get(i);
            String[] StringSplit = StrQuestion.split(";");
            String CorrectAnswer = StringSplit[1];
            System.out.println(StringSplit[0]);
            for (int k = 2; k<StringSplit.length; k++) {
                System.out.println(k-1+")"+StringSplit[k]);
            }
            System.out.print("Вариант ответа: ");
            Scanner scan = new Scanner(System.in);
            String UserAnswer = scan.nextLine();

            if (CorrectAnswer.equals(StringSplit[Integer.parseInt(UserAnswer)+1])) {
                    CountCorrectAnswer++;
                    CheckCorrectAnswer = true;
                }
            if (CheckCorrectAnswer == false)
                CountInorrectAnswer++;
            else
                CheckCorrectAnswer = false;

        }
        System.out.println("У вас "+CountCorrectAnswer+" правильных ответов и "+CountInorrectAnswer+" неправильных ответов");

    }

}
