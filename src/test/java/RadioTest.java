import org.junit.jupiter.api.Test;
import ru.netology.yavaqa.Radio;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void testSetStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }
    @Test
    public void testInitialNumber() {
        Radio radio = new Radio();
        radio.setStation(0);
        assertEquals(0, radio.getStation());
    }
    @Test
    public void testMaximumAllowable() {
        Radio radio = new Radio();
        radio.setStation(9);
        assertEquals(9, radio.getStation());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        assertEquals(0, radio.getStation());
    }
    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();
        assertEquals(9, radio.getStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testMaxVolumeLimit() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testMinVolumeLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}

