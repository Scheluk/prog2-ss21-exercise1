/**
 * Link to Repo:
 * https://github.com/Scheluk/prog2-ss21-exercise1
 */

import org.junit.jupiter.api.Test;

import java.lang.invoke.WrongMethodTypeException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void fuelPerModule1() {
        assertEquals(App.fuelPerModule(12), 2);
    }

    @Test
    void fuelPerModule2() {
        assertEquals(App.fuelPerModule(14), 2);
    }

    @Test
    void fuelPerModule3() {
        assertEquals(App.fuelPerModule(1969), 654);
    }

    @Test
    void fuelPerModule4() {
        assertEquals(App.fuelPerModule(100756), 33583);
    }

    @Test
    void fuelPerModule5() {
        assertEquals(App.fuelPerModule(3), 0);
    }

    @Test
    void fuelPerModule6() {
        assertEquals(App.fuelPerModule(-69), 0);
    }

    @Test
    void sumOfAllModules1() {
        assertEquals(App.sumOfAllModules(new int[]{4140, 7480, 10450, 11238, 18209}), 17161);
    }

    @Test
    void sumOfAllModules2() {
        assertEquals(App.sumOfAllModules(new int[]{2016, 5570, 6634}), 4733);
    }

    @Test
    void sumOfAllModules3() {
        assertEquals(App.sumOfAllModules(new int[]{3392, 7204, 8181, 8705, 9394, 12219, 15993, 16123, 16452, 18615}), 38737);
    }

    @Test
    void fuelAndExtraFuelPerModule1() {
        assertEquals(App.fuelAndExtraFuelPerModule(14), 2);
    }

    @Test
    void fuelAndExtraFuelPerModule2() {
        assertEquals(App.fuelAndExtraFuelPerModule(1969), 966);
    }

    @Test
    void fuelAndExtraFuelPerModule3() {
        assertEquals(App.fuelAndExtraFuelPerModule(100756), 50346);
    }

    @Test
    void sumOfAllModulesAndFuels1() {
        assertEquals(App.sumOfAllModulesAndFuels(new int[]{2016, 5570, 6634}), 7042);
    }

    @Test
    void sumOfAllModulesAndFuels2() {
        assertEquals(App.sumOfAllModulesAndFuels(new int[]{4140, 7480, 10450, 11238, 18209}), 25637);
    }
}