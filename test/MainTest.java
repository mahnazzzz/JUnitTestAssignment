import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void differenceAssertions(){
        Account ac = new Account(550.4, "Mahnaz");
        Main main = new Main();

        assertEquals(27.519999999999996, main.calculateYearlyInterest(ac));
    }
}