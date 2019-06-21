import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {


    @Test
    public void sampleTests() {
        assertEquals(Main.sumOfAngles(3),180);
        assertEquals(Main.sumOfAngles(4),360);
    }

}

