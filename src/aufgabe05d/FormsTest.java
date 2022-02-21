package aufgabe05d;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormsTest {
    static Quader quader;

    @BeforeAll
    static void prepareData(){
         quader = new Quader(4, 5, 10);
    }

    @Test
    void getSurfaceAreaTest() {
        assertEquals(220, quader.getSurfaceArea());
    }

    @Test
    void getVolumeTest() {
        assertEquals(200, quader.getVolume());
    }

    @Test
    void getBaseAreaTest() {
        assertEquals(20, quader.getBaseArea());
    }

    @Test
    void getBasePerimetrTest() {
        assertEquals(18, quader.getBasePerimeter());
    }
}