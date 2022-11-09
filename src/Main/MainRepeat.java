package Main;

import java.util.Scanner;


        //String output = text.replace("DONE", "") + " ";


public class MainRepeat {


    static Logic logic = new Logic();
    static MainRepeat repeat = new MainRepeat();
    Scanner input = new Scanner(System.in);
    String text = "";


    public void RunCode(String userInput) {
        while (!"stop".equalsIgnoreCase(text)) {

            text = input.nextLine();

            if (!text.equalsIgnoreCase("stop")) {
                logic.NumOfChars(text);

                logic.increaseNumOfLines();
            }

        }
    }
            public static void main (String[]args){


                System.out.println(" enter text (type stop to quit): ");
                System.out.println("Stop program when you write word stop ");

               repeat.text = repeat.input.next();
               repeat.RunCode(repeat.text);


                System.out.println("Number of non-space characters: " + logic.getNumOfChars());
                System.out.println("Number of words: " + logic.getNumOfWords());
                System.out.println("Number of lines: " + logic.getNumOfLines());


            }
        }







