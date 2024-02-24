package SampleExmaples;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({ExampleTest.class, SquareTest.class, MathTest.class})
@IncludeTags("UnitTest")
public class ExampleTestSuite {


}
