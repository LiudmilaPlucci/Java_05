import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    @Test

    public void testIntersection_HappyPath() {
        ///AAA
        int[] array1 = new int[]{0, 1, 2, 3, 4, 5};
        int[] array2 = new int[]{8, 9, 4, 2};
        int[] expectedResult = new int[]{2,4};

        //act
        int[] actualResult = new Intersection().findIntersection(array1, array2);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }


    @Test

    public void testIntersectionSomeNegative_HappyPath() {
        ///AAA
        int[] array1 = new int[]{1, 2, 4, 5, 8, 9};
        int[] array2 = new int[]{8, 9, -4, -2};
        int[] expectedResult = new int[]{8,9};

        //act
        int[] actualResult = new Intersection().findIntersection(array1, array2);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testIntersection_Negative() {
        ///AAA
        int[] array1 = new int[]{1, 2, 4, 5, 89};
        int[] array2 = new int[]{8, 9, 45};
        int[] expectedResult = new int[]{};

        //act
        int[] actualResult = new Intersection().findIntersection(array1, array2);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testIntersection1_Negative() {
        ///AAA
        int[] array1 = new int[]{};
        int[] array2 = new int[]{};
        int[] expectedResult = new int[]{};

        //act
        int[] actualResult = new Intersection().findIntersection(array1, array2);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}
