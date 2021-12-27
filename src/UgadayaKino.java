import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UgadayaKino {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Scanner fileScanner = new Scanner(new File ("src/quotes_file.txt"));
        int score = 0;
        String [] questionAnswer = new String[50];

        while (fileScanner.hasNextLine()){
            String questionA = fileScanner.nextLine();
            questionAnswer = questionA.split(" -> ");
            String answer = questionAnswer[0];


        System.out.println("Из какого фильма эта цитата -" + questionAnswer[1]);
        System.out.print("Ваш ответ:");
        String playerAnswer = scanner.nextLine();

        if(answer.equalsIgnoreCase(playerAnswer)) {System.out.println("Верно"); score++;}
        else System.out.println("Не верно, ответ "  + questionAnswer[0]);
    }
        System.out.println("Вы ответили верно " + score + " раз");
    }
}
