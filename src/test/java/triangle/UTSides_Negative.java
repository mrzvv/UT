package triangle;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class UTSides_Negative {

    @Test(dataProvider = "dataForLess", dataProviderClass = TriangleData.class)
    public void tstSidesLess(double a, double b, double c) {
        new Triangle(a, b, c).checkTriangle();
        fail("[The sum of two sides is less than the 3d side. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForEqual", dataProviderClass = TriangleData.class)
    public void tstSidesEqual(double a, double b, double c) {
        new Triangle(a, b, c).checkTriangle();
        fail("[The sum of two sides is equal to the 3d side. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNull", dataProviderClass = TriangleData.class)
    public void tstSidesNull(double a, double b, double c) {
        new Triangle(a, b, c).checkTriangle();
        fail("[One (or more) of the sides is 0. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNegative", dataProviderClass = TriangleData.class)
    public void tstSidesNegative(double a, double b, double c) {
        new Triangle(a, b, c).checkTriangle();
        fail("[One (or more) of the sides is negative. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNaN", dataProviderClass = TriangleData.class)
    public void tstSidesNaN(double a, double b, double c) {
        new Triangle(a, b, c).checkTriangle();
        fail("[One (or more) of the sides is NaN. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForPositiveInfinity", dataProviderClass = TriangleData.class)
    public void tstSidesPosInf(double a, double b, double c) {
        new Triangle(a, b, c).checkTriangle();
        fail("[One (or more) of the sides is positive infinity. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNegativeInfinity", dataProviderClass = TriangleData.class)
    public void tstSidesNegInf(double a, double b, double c) {
        new Triangle(a, b, c).checkTriangle();
        fail("[One (or more) of the sides is negative infinity. Exception must be caused!]");
    }
}
