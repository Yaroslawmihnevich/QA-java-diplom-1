package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {

    private static final Database DATABASE = new Database();

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {DATABASE.availableBuns().get(0), "black bun", 100.0d}, {DATABASE.availableBuns().get(1), "white bun", 200.0d}
        });
    }

    private final Bun bun;

    private final String bunName;

    private final double bunPrice;

    public BunTest(Bun bun, String bunName, double bunPrice) {
        this.bun = bun;
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }

    @Test
    public void getName_success() {
        assertEquals(bunName, bun.getName());
    }

    @Test
    public void getPrice_success() {
        assertEquals(bunPrice, bun.getPrice(), 0.00000001);
    }
}