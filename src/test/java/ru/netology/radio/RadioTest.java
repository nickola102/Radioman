package ru.netology.radio;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,0",
            "'number near lower limit',1,1",
            "'number within range',5,5",
            "'number near upper limit1',8,8",
            "'number = upper limit',9,9",
            "'number near upper limit2',10,0",
            "'number upper range',15,0"
    })
    public void shouldSetCurrentStation(String testName, int newNumber, int expected) {

        radio.setCurrentStation(newNumber);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,1",
            "'number near lower limit',1,2",
            "'number within range',5,6",
            "'number near upper limit1',8,9",
            "'number = upper limit',9,0"
    })
    public void shouldSetNextStation(String testName, int currentNumber, int expected) {

        radio.setCurrentStation(currentNumber);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,9",
            "'number near lower limit',1,0",
            "'number within range',5,4",
            "'number near upper limit1',8,7",
            "'number = upper limit',9,8"
    })
    public void shouldSetPrevStation(String testName, int currentNumber, int expected) {

        radio.setCurrentStation(currentNumber);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,0",
            "'level near lower limit',1,1",
            "'level within range',50,50",
            "'level near upper limit1',99,99",
            "'level = upper limit',100,100",
            "'level near upper limit2',101,0",
            "'level = upper range',150,0"
    })

    public void shouldSetCurrentVolume(String testName, int newLevel, int expected) {

        radio.setCurrentVolume(newLevel);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,1",
            "'level near lower limit',1,2",
            "'level within range',50,51",
            "'level near upper limit1',99,100",
            "'level = upper limit',100,100"
    })
    public void shouldMakeLouder(String testName, int currentLevel, int expected) {

        radio.setCurrentVolume(currentLevel);
        radio.makeLouder();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,0",
            "'level near lower limit',1,0",
            "'level within range',50,49",
            "'level near upper limit1',99,98",
            "'level = upper limit',100,99"
    })
    public void shouldMakeQuieter(String testName, int currentLevel, int expected) {

        radio.setCurrentVolume(currentLevel);
        radio.makeQuieter();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    Radio radio1 = new Radio(30);

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,0",
            "'number near lower limit',1,1",
            "'number within range',15,15",
            "'number near upper limit1',29,29",
            "'number = upper limit',30,0",
            "'number near upper limit2',31,0",
            "'number upper range',50,0"
    })
    public void shouldSetCurrentStation1(String testName, int newNumber, int expected) {

        radio1.setCurrentStation(newNumber);
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,1",
            "'number near lower limit',1,2",
            "'number within range',15,16",
            "'number near upper limit1',28,29",
            "'number = upper limit',29,0"
    })
    public void shouldSetNextStation1(String testName, int currentNumber, int expected) {

        radio1.setCurrentStation(currentNumber);
        radio1.setNextStation();
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,29",
            "'number near lower limit',1,0",
            "'number within range',15,14",
            "'number near upper limit1',28,27",
            "'number = upper limit',29,28"
    })
    public void shouldSetPrevStation1(String testName, int currentNumber, int expected) {

        radio1.setCurrentStation(currentNumber);
        radio1.setPrevStation();
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,0",
            "'level near lower limit',1,1",
            "'level within range',50,50",
            "'level near upper limit1',99,99",
            "'level = upper limit',100,100",
            "'level near upper limit2',101,0",
            "'level = upper range',150,0"
    })

    public void shouldSetCurrentVolume1(String testName, int newLevel, int expected) {

        radio1.setCurrentVolume(newLevel);
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,1",
            "'level near lower limit',1,2",
            "'level within range',50,51",
            "'level near upper limit1',99,100",
            "'level = upper limit',100,100"
    })
    public void shouldMakeLouder1(String testName, int currentLevel, int expected) {

        radio1.setCurrentVolume(currentLevel);
        radio1.makeLouder();
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,0",
            "'level near lower limit',1,0",
            "'level within range',50,49",
            "'level near upper limit1',99,98",
            "'level = upper limit',100,99"
    })
    public void shouldMakeQuieter1(String testName, int currentLevel, int expected) {

        radio1.setCurrentVolume(currentLevel);
        radio1.makeQuieter();
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }
}