import java.util.Scanner;

public class RepeatWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter text (type DONE to quit): ");
        String text = "";
        String output = "";
        while (!"DONE".equals(text)) {
            text = input.next();
            output += text.replace("DONE", "") + " " ;
        }
        String[] numOfWords = output.split(" ");
        String[] numOfChars = output.split("");
        System.out.print("Number of lines: " + numOfWords.length);
        System.out.println("");
        System.out.print("Number of non-space characters: " + numOfChars.length);
    }
}