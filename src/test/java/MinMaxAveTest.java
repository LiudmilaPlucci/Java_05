import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test

    public void testMinMaxAveTest_HappyPath() {
        ///AAA
//        int[] array = new int[]{1,2,3,4,5,6,7,8};
        int [] expectedResult = {3,7,5};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(new int[]{1,2,3,4,5,6,7,8},2,6);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}
