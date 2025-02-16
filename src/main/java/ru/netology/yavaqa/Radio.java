package ru.netology.yavaqa;

public class Radio {
    private int station = 0; // Номер текущей радиостанции (0-9)
    private int volume = 0;  // Уровень громкости (0-100)

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public void nextStation() {
        station = (station + 1) % 10;  // Переход к следующей станции
    }

    public void prevStation() {
        station = (station + 9) % 10;  // Переход к предыдущей станции
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
