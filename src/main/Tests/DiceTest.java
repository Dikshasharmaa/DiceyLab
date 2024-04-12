import org.junit.Assert;
import org.junit.Test;


public class DiceTest{
    @Test
    public void TestRandonNumer(){
        Dice dice = new Dice();
        boolean expected = dice.randomNumber() <=6;
        Assert.assertTrue(expected);

    }
    @Test
    public void DiceRollTest(){
        Dice dice = new Dice();
        Boolean expected = dice .diceSum(2) <=12;
        Assert.assertTrue(expected);
    }
}
