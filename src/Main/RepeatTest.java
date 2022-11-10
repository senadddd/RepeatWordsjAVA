package Main;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class RepeatTest {



    @Test
    public void getNumOfChars() {

        //Arrange

        Logic be = new Logic();
        //MainRepeat mR = new MainRepeat();
        be.NumOfChars("be");
        be.NumOfChars("be");
        //mR.RunCode("stop");


        //Act
        int actual = be.getNumOfChars();
        int expected = 4;


        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void getNumOfWords() {

        //Arrange

        Logic be = new Logic();
        //MainRepeat mR = new MainRepeat();
        be.NumOfChars("be");
        be.NumOfChars("be");
        //mR.RunCode("stop");


        //Act
        int actual = be.getNumOfWords();
        int expected = 2;


        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void getNumOfLines() {

        //Arrange

        Logic be = new Logic();

        be.NumOfLines();
        be.NumOfLines();
        //mR.RunCode("stop");


        //Act
        int actual = be.getNumOfLines();
        int expected = 2;


        //Assert
        assertEquals(expected, actual);

    }
}