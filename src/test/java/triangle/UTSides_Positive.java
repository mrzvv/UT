package triangle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UTSides_Positive {

    @Test (dataProvider = "dataForRegularTriangle", dataProviderClass = TriangleData.class)
    public void tstRegular (double a, double b, double c) {
        Assert.assertEquals(new Triangle(a, b, c).detectTriangle(), 4, "Correct regular triangle " +
                "has not been created with parameters [" + a + "], [" + b + "], [" + c + "];");
    }

    @Test (dataProvider = "dataForIsoscelesTriangle", dataProviderClass = TriangleData.class)
    public void tstIsosceles (double a, double b, double c) {
        Assert.assertEquals(new Triangle(a, b, c).detectTriangle(), 2, "Correct isosceles triangle " +
                "has not been created with parameters [" + a + "], [" + b + "], [" + c + "];");
    }

    @Test
    public void tstEquilateral () {
        Assert.assertEquals(new Triangle(7.568, 7.568, 7.568).detectTriangle(), 3, "Correct equilateral triangle " +
                "has not been created;");
    }

    @Test (dataProvider = "dataForRectangularTriangle", dataProviderClass = TriangleData.class)
    public void tstRectangular (double a, double b, double c) {
        Assert.assertEquals(new Triangle(a, b, c).detectTriangle(), 8, "Correct rectangular triangle " +
                "has not been created with parameters [" + a + "], [" + b + "], [" + c + "];");
    }

    @Test (dataProvider = "dataForRectangularAndIsoscelesTriangle", dataProviderClass = TriangleData.class)
    public void tstRectangularAndIsosceles (double a, double b, double c) {
        Assert.assertEquals(new Triangle(a, b, c).detectTriangle(), 10, "Correct rectangular and isosceles triangle " +
                "has not been created with parameters [" + a + "], [" + b + "], [" + c + "];");
    }
}
