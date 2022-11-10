package Main;

public class Logic {
    private int numOfWords; // atribut private variables, numOfWords

    private int numOfChars; //and numOfChars

    private int numOfLines; // numOfLines

    public Logic() {
        numOfWords = 0; // konstruktor som initierar alla tre variablerna med nollor
        numOfChars = 0;
        numOfLines = 0;
    }

    public int getNumOfWords(){  //Metoden returnerar värdet på variabeln numOfWords,

        return numOfWords;
    }


    public int getNumOfChars(){  //Metoden returnerar värdet på variabeln getNumOfChars
        return numOfChars;
    }

    public int getNumOfLines(){
        return numOfLines;
    }

    public void NumOfChars(String Text){   //deklarera en variabel som heter numOfChars.
        numOfChars = numOfChars + Text.length(); //   ställer in värdet på numOfChars till summan av textlängd
        numOfWords++;   //deklarerar koden  variabel  och ökar dess värde med ett.
    }

    public void NumOfLines() {
        numOfLines++;
    }
}




