import Candy.Candy;
import Candy.ChocolateCandy;
import Main.Gift;
import org.junit.Assert;
import org.junit.Test;

public class UTest {
    Gift gift = new Gift();
    @Test
    public void searchBySugarContainmentTest()
    {
    gift.addCandy(new ChocolateCandy("Test candy",10,2,"milk"));
    Candy testCandy =  gift.searchSweetnessBySugarContainment(2,5);
    Assert.assertEquals(testCandy.getSugarContainment(),2,0.001);
    }
}
