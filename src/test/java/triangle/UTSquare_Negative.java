package triangle;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class UTSquare_Negative {

    @Test(dataProvider = "dataForLess", dataProviderClass = TriangleData.class)
    public void tstSquareLess (double a, double b, double c) {
        new Triangle(a, b, c).getSquare();
        fail("[An attempt to calculate the square of non-existing triangle (sum of two sides is less than the 3d) has been made. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForEqual", dataProviderClass = TriangleData.class)
    public void tstSquareEqual (double a, double b, double c) {
        new Triangle(a, b, c).getSquare();
        fail("[An attempt to calculate the square of non-existing triangle (sum of two sides is equal to the 3d) has been made. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNull", dataProviderClass = TriangleData.class)
    public void tstSquareNull (double a, double b, double c) {
        new Triangle(a, b, c).getSquare();
        fail("[An attempt to calculate the square of non-existing triangle (one or more 0 sides) has been made. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNegative", dataProviderClass = TriangleData.class)
    public void tstSquareNegative (double a, double b, double c) {
        new Triangle(a, b, c).getSquare();
        fail("[An attempt to calculate the square of non-existing triangle (one or more negative sides) has been made. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNaN", dataProviderClass = TriangleData.class)
    public void tstSquareNaN (double a, double b, double c) {
        new Triangle(a, b, c).getSquare();
        fail("[An attempt to calculate the square of non-existing triangle (one or more NaN sides) has been made. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForPositiveInfinity", dataProviderClass = TriangleData.class)
    public void tstSquarePosInf (double a, double b, double c) {
        new Triangle(a, b, c).getSquare();
        fail("[An attempt to calculate the square of non-existing triangle (one or more positive infinity sides) has been made. Exception must be caused!]");
    }

    @Test(dataProvider = "dataForNegativeInfinity", dataProviderClass = TriangleData.class)
    public void tstSquareNegInf (double a, double b, double c) {
        new Triangle(a, b, c).getSquare();
        fail("[An attempt to calculate the square of non-existing triangle (one or more negative infinity sides) has been made. Exception must be caused!]");
    }
}
