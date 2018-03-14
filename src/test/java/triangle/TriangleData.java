package triangle;

import org.testng.annotations.DataProvider;
import static java.lang.Double.NaN;

public class TriangleData {

    @DataProvider(name = "dataForRegularTriangle")
    public static Object[][] dataForRegularTriangle() {
        return new Object[][]
                {
                        {16.7, 18.9, 32.2},
                        {16.7, 32.2, 18.9},
                        {18.9, 32.2, 16.7},
                        {18.9, 16.7, 32.2},
                        {32.2, 16.7, 18.9},
                        {32.2, 18.9, 16.7},
                        {32.2, 18.9, 16.7},
                };
    }

    @DataProvider (name = "dataForIsoscelesTriangle")
    public static Object[][] dataForIsoscelesTriangle() {
        return new Object[][]
                {
                        {4.0, 3.2, 3.2},
                        {3.2, 4.0, 3.2},
                        {3.2, 3.2, 4.0},
                };
    }

    @DataProvider (name = "dataForRectangularTriangle")
    public static Object[][] dataForRectangularTriangle() {
        return new Object[][]
                {
                        {4, 3, 5},
                        {4, 5, 3},
                        {3, 5, 4},
                        {3, 4, 5},
                        {5, 4, 3},
                        {5, 3, 4},
                };
    }

    @DataProvider (name = "dataForRectangularAndIsoscelesTriangle")
    public static Object[][] dataForRectangularAndIsoscelesTriangle() {
        return new Object[][]
                {
                        {7, 7, Math.sqrt(98)},
                        {Math.sqrt(98), 7, 7},
                        {7, Math.sqrt(98), 7},
                };
    }

    @DataProvider (name = "dataForLess")
    public static Object[][] dataForLess() {
        return new Object[][]
                {
                        {3.7, 2.11, 16.05},
                        {3.7, 16.05, 2.11},
                        {2.11, 16.05, 3.7},
                        {2.11, 3.7, 16.05},
                        {16.05, 3.7, 2.11},
                        {16.05, 2.11, 3.7},
                };
    }

    @DataProvider (name = "dataForEqual")
    public static Object[][] dataForEqual() {
        return new Object[][]
                {
                        {16.7, 15.5, 32.2},
                        {16.7, 32.2, 15.5},
                        {15.5, 32.2, 16.7},
                        {15.5, 16.7, 32.2},
                        {32.2, 16.7, 15.5},
                        {32.2, 15.5, 16.7},
                };
    }

    @DataProvider (name = "dataForNull")
    public static Object[][] dataForNull() {
        return new Object[][]
                {
                        {0, 18.9, 32.2},
                        {18.9, 0, 16.7},
                        {32.2, 16.7, 0},
                        {0, 16.7, 0},
                        {32.2, 0, 0},
                        {0, 0, 16.7},
                        {0, 0, 0},
                };
    }

    @DataProvider (name = "dataForNegative")
    public static Object[][] dataForNegative() {
        return new Object[][]
                {
                        {-16.7, 18.9, 32.2},
                        {18.9, 32.2, -16.7},
                        {32.2, -16.7, 18.9},
                        {-16.7, -18.9, 32.2},
                        {-18.9, 32.2, -16.7},
                        {32.2, -16.7, -18.9},
                        {-32.2, -16.7, -18.9},
                };
    }

    @DataProvider (name = "dataForNaN")
    public static Object[][] dataForNaN() {
        return new Object[][]
                {
                        {NaN, 18.9, 32.2},
                        {18.9, NaN, 16.7},
                        {32.2, 16.7, NaN},
                        {NaN, 16.7, NaN},
                        {32.2, NaN, NaN},
                        {NaN, NaN, 16.7},
                        {NaN, NaN, NaN},
                };
    }

    @DataProvider (name = "dataForPositiveInfinity")
    public static Object[][] dataForPositiveInfinity() {
        return new Object[][]
                {
                        {Double.POSITIVE_INFINITY, 18.9, 32.2},
                        {18.9, Double.POSITIVE_INFINITY, 16.7},
                        {32.2, 16.7, Double.POSITIVE_INFINITY},
                        {Double.POSITIVE_INFINITY, 16.7, Double.POSITIVE_INFINITY},
                        {32.2, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                        {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 16.7},
                        {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                };
    }

    @DataProvider (name = "dataForNegativeInfinity")
    public static Object[][] dataForNegativeInfinity() {
        return new Object[][]
                {
                        {Double.NEGATIVE_INFINITY, 18.9, 32.2},
                        {18.9, Double.NEGATIVE_INFINITY, 16.7},
                        {32.2, 16.7, Double.NEGATIVE_INFINITY},
                        {Double.NEGATIVE_INFINITY, 16.7, Double.NEGATIVE_INFINITY},
                        {32.2, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
                        {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 16.7},
                        {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
                };
    }
}
