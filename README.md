## AVIV QA Web Technical Test with Java and Selenium WebDriver

This repository includes code for automating test scenarios on the https://demo.nopcommerce.com/ website using Java and the Selenium WebDriver library.
The automation follows the principles of the Page Object Model (POM) and Data-Driven Testing (DDT).

## Project Structure

- **src/main/java/pageObjects:** Contains classes representing individual pages, each containing web elements and corresponding action methods.
- **src/main/java/utilities:** Contains helper classes and methods for common functionalities and reusable utilities
- **src/main/java/waitTimes:** Contains predefined wait times for explicit waits

- **src/test/java/testBase:** Contains common setup and teardown methods along with TakesScreenshot and Extent Report logic.
- **src/test/java/testCases:** Contains test classes and methods
- **pom.xml:** Maven configuration file with project dependencies and settings.


### Continuous Integration (CI) with Jenkins
- This project is set up for CI using Jenkins.
- Jenkins will trigger a new build whenever changes are pushed to the repository.
- Jenkins hosted on webserver - https://busy-showers-clap.loca.lt/ with the help of https://localtunnel.github.io/www

### Reporting with Extent Report
- Extent Report is used for comprehensive test reporting.
- Reports are generated after each test execution and can be found in the /reports directory.

### Screenshots for failed test
- The screenshot for the failed test is available in the /screenshots directory.

### Parallel Test Execution
- CrossBrowserParallelTestExecution.xml file is configured to provide parallel test execution, which allowing parallel test execution on Chrome and Edge browsers.
- Additional configurations can be added/modified to extend test execution to more browsers.
- Implemented ThreadLocal<WebDriver> to create a separate WebDriver instance for each thread. This ensures that each thread operates independently, preventing interference between parallel tests.

### Test Scenarios
##### Scenario 1: User Signup and Checkout
    Test : VerifyNewUserRegistrationAndCheckoutFunctionalityIT
##### Scenario 2: Invalid Signup Attempt
    Test : VerifyRegistrationPageValidationMessagesIT
##### Scenario 3: Existing User Login and Checkout
    Test : VerifyExistingUserLogInAndCheckoutFunctionalityIT
##### Scenario 4: Verify Cart Functionality
    Test : VerifyCartFunctionality

### Future Improvements
#### To configure the test environment for parallel test execution:
1. DOCKER - We can configure Docker for parallel test execution, enabling compatibility across different operating systems and browser versions for increased flexibility and compatibility.
   
#### For enhanced test efficiency and code readability:
1. We can add a method in the pageObjects class constructor to verify the visibility of the last-loaded element, ensuring the complete loading of the page.
2. We can streamline page navigation by returning the pageObject class constructor within the event method.
This eliminates the need for a separate line in the test class to create the constructor, instead, it can be assigned by calling this method.
3. We can enhance the process of defining page elements by replacing the use of the By class with a custom class, such as CC(By selector, String description).
By employing this approach, we can create customized assertion messages directly in the BasePage methods.
This eliminates the need to create Assert methods in the Test class and enhances the overall readability of the test steps.
#### Static code analysis tool
1. We can configured Checkstyle which is a static code analysis tool, to enforce coding standards, reducing redundant PR review suggestions during code review and ensuring a clean and consistent code style.

### Issues and Challenges
