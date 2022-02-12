package ru.netology.radio;

public class Radio {
    private int id;
    private String name;
    private int numberOfStation = 10;
    private int currentStation;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > (numberOfStation - 1)) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if (currentStation == (numberOfStation - 1)) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStation - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void makeLouder() {
        if (currentVolume < maxVolume) {
            currentVolume++;

        }
    }

    public void makeQuieter() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}