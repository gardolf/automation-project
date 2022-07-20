# Automation-Project

Project is built using Java, Selenium, TestNG, and Maven.

Eclipse IDE used.

Tests will run on Google Chrome.
<br/><br/>

## Import Project ##
How to import the project if using Eclipse
1. Launch Eclipse
2. Click File in the top left
3. Click Import
4. Expand General and click Projects from Folder or Archive, click Next
5. Add the file path to where the hudlmavenproject exists
6. Select hudlmavenproject
7. Click Finish
<br/><br/>

## Chrome Driver ##
The chromedriver needs to match the version of Chrome installed on your machine.

These tests are using Chrome version 103.

How to check your Chrome version:
1. Open Google Chrome.
2. Click the 3 dots in the upper-right corner of the window.
3. Hover your cursor over "Help"
4. Click "About Google Chrome"

If the version currently installed does not match 103 - follow this link to download the chromedriver that matches the Chrome version installed.
https://chromedriver.chromium.org/downloads

How to add new chrome driver if needed
1. Unzip and open the folder once the correct chromedriver is downloaded
2. Copy "chromedriver.exe" (CTRL+C) in the unzipped folder
3. Paste (CTRL+V) it in the "drivers" folder in the imported project
    - Overwrite the existing chromedriver or delete the current one before you paste.
<br/><br/>

## Add Credentials For Login Test ##
1. Expand src/test/java
2. Expand com.gardolf.hudlmavenproject
3. Double Click loginTest.java
4. Add valid email on line 20
5. Add valid password on line  21
6. Save the project (CTRL+S)

From here you can run the test suite by doing the below or following **Run Test Suite** section
1. Right click anywhere on the code
2. Click Run As, Click TestNG Test
3. Five tests should execute

## Run Test Suite ##
How to run Test Suite
1. At the top there's a green play button. Do not click it
2. Click the down arrow next to the green play button
3. Click 1 loginTest
4. Five tests should execute<br/>
