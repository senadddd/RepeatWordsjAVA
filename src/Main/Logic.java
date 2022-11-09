package Main;

public class Logic {
    private int numOfWords; // atribut private variables, numOfWords

    private int numOfChars; //and numOfChars

    private int numOfLines;

    public Logic() {
        numOfWords = 0; // konstruktor
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

    public void NumOfChars(String Text){
        numOfChars = numOfChars + Text.length(); //
        numOfWords++;

    }

    public void increaseNumOfLines(){
      numOfLines++;
    }




}




