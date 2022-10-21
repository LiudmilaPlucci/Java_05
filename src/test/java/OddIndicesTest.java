import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddIndicesTest {

    @Test

    public void testOddIndices_HappyPath() {
        ///AAA
        int[] array = new int[]{2, 3, 5, 9, 11, 8, 15, 18, -61, 91};

        String expectedResult = Arrays.toString(new int[]{3, 9, 8, 18, 91});

        //act
        String actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testOddIndicesWithOneNumber_HappyPath() {
        ///AAA
        int[] array = new int[]{0};

        String expectedResult = Arrays.toString(new int[]{});

        //act
        String actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testOddIndices_Negative() {
        ///AAA
        int[] array = new int[]{};

        String expectedResult = Arrays.toString(new int[]{});

        //act
        String actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}



