import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    Application application = new Application("name", 30, 180);
    Application application1 = new Application("name", 50, 150);

    @Test
    void verifyName() {
        assertNotNull("name");
    }

    @Test
    void verifyAge() {
        assertFalse(application.verifyAge());
        assertTrue(application1.verifyAge());
    }

    @Test
    void verifyHeigth() {
        assertFalse(application1.verifyHeigth());
        assertTrue(application.verifyHeigth());
    }
}