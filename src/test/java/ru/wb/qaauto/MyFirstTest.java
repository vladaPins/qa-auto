package ru.wb.qaauto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

@Listeners(value = CustomTestListener.class)
public class MyFirstTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(MyFirstTest.class);

  @BeforeClass(groups = "before class group")
  public void beforeClass() {
    LOGGER.info("BEFORE CLASS");
  }

  @BeforeMethod(description = "before method call")
  public void beforeMethod() {
    LOGGER.info("BEFORE METHOD");
  }

  @Test(groups = "1st group", description = "This is first test desc")
  public void myFirstTest() {
    LOGGER.info("MY FIRST TEST");
  }

  @Test(groups = "1st group", description = "This is second test desc")
  public void mySecondTest() {
    LOGGER.info("MY SECOND TEST");
  }

  @Test(groups = "2d group", dataProvider = "sumOf2DigitsDataProvider")
  public void testOnSumOf2Digits(int a, int b, int res) {
    Assert.assertEquals(a + b, res);
  }

  @Test
  public void testWithSoftAssert() {
    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(2 + 2, 5);
  }

  @Test
  public void testWithHardAssert() {
    Assertion assertion = new Assertion();

    assertion.assertEquals(2 + 2, 5);
  }

  @Test
  public void myFailureTest() {
    LOGGER.info("Working...");
    Assert.fail("only for testing failure test");
  }

  @AfterMethod(description = "after method call")
  public void afterMethod() {
    LOGGER.info("AFTER METHOD");
  }

  @AfterClass(groups = "after class group")
  public void afterClass() {
    LOGGER.info("AFTER CLASS");
  }

  @DataProvider
  public Object[][] sumOf2DigitsDataProvider() {
    return new Object[][]{
        {1, 1, 2},
        {2, 2, 4},
        {3, -1, 2}
    };
  }
}
