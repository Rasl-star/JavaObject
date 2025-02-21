package ru.netology.yavaqa;


    public class Radio {
        private int stationCount;
        private int currentStation;
        private int volume;

        public Radio() {
            this.stationCount = 10;
        }

        public Radio(int stationCount) {
            this.stationCount = stationCount;
        }

        public int getStationCount() {
            return stationCount;
        }

        public int getStation() {
            return currentStation;
        }

        public void setStation(int station) {
                this.currentStation = station;
        }

        public void nextStation() {
            currentStation = (currentStation + 1) % stationCount;
        }

        public void prevStation() {
            currentStation = (currentStation - 1 + stationCount) % stationCount;
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
