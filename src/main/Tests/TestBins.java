import org.junit.Assert;
import org.junit.Test;

public class TestBins{
    @Test
    public void binConstructorTest(){
        Bins bin = new Bins(2);
        int expected = 0;
        int actual = bin.getBin(2);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void incrementTest(){
        Bins bin = new Bins(2);
        bin.incrementBin(2);
        boolean expected = bin.getBin(2)==1;
        Assert.assertFalse(expected);
    }
    @Test
    public void getBinTest(){
        Bins bin = new Bins(2);
        int expected = 0;
        int actual = bin.getBin(4);
        Assert.assertEquals(expected, actual);
    }
}