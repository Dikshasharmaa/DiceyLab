import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {
    @Test
    public void runTest(){
        Simulation sim = new Simulation(2,10);
        sim.runSimulation();
        boolean expected = sim.results.getBin(2)<=10;
        Assert.assertTrue(expected);
    }
}
