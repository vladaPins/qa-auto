package ru.wb.qaauto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {

  public static final Logger LOGGER = LoggerFactory.getLogger(CustomTestListener.class);

  @Override
  public void onTestStart(ITestResult result) {
    LOGGER.info("TEST {} STARTER {}", result.getTestClass().getName(), result.getMethod().getMethodName());
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    LOGGER.info("TEST {} SUCCESS {}", result.getTestClass().getName(), result.getMethod().getMethodName());
  }

  @Override
  public void onTestFailure(ITestResult result) {
    LOGGER.info("TEST {} FAILED {}", result.getTestClass().getName(), result.getMethod().getMethodName());
  }
}
