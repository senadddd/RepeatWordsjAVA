package Main;

import java.util.Scanner;

public class MainRepeat {


    static Logic logic = new Logic();
    static MainRepeat repeat = new MainRepeat();
    Scanner input = new Scanner(System.in);   //Scanner  läsa text från användaren och lagra
                                                  // den i en strängvariabel med namnet text.
    String text = "";


    public void RunCode(String userInput) {                  // loop som körs tills användaren anger "stopp" i textrutan.
                                                            // Koden börjar med att kolla om det finns något i
                                                           //  textrutan och sedan kollar den om det inte är "stopp".
        while (!"stop".equalsIgnoreCase(text)) {

            text = input.nextLine();

            if (!text.equalsIgnoreCase("stop")) {
                logic.NumOfChars(userInput);

                logic.NumOfLines();     // returnera hur många rader finns i textsträngen
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







