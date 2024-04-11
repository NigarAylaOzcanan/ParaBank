# Agile Software Testing Project - ParaSoft/Parabank US Sprint

**One Week Sprint**
**URL:** [Parasoft Project](https://parabank.parasoft.com/)
**Alternative URL:** [Parasoft Project](https://para.testar.org/)

## Project Description:

Parabank is a virtual banking application that represents a simulated environment for testing and simulating financial
transactions. It is not a real financial institution but is used in place of a real banking application during software
testing.

The test environments provided above are designed for performing various operations that users can execute in a
web-based banking application. They are valuable tools for simulating financial transactions such as account creation,
money transfers, credit application submissions, and bill payments. They are utilized for implementing various test
scenarios.

The environment we will use for this sprint: [https://parabank.parasoft.com/](https://parabank.parasoft.com/)

## User Stories & Contributors

| User Story                               | Contributor                                               | Role                       |
|------------------------------------------|-----------------------------------------------------------|----------------------------|
| [US_601: User Registration]()            | [Erdem Gürel](https://github.com/artam109)                | QA Engineer                |
| [US_602: User Login]()                   | [Onur Girgin](https://github.com/Mednasa)                 | QA Engineer                |
| [US_603: Bill Payment Functionality]()   | [Ahmet Kaya](https://github.com/0AhmetKaya0)              | QA Engineer                |
| [US_604: Account Creation]()             | [Nigar Ayla Özcanan](https://github.com/NigarAylaOzcanan) | Project Lead & QA Engineer |
| [US_605: N/A]()                          | [N/A](N/A)                                                | N/A                        |
| [US_606: Inter-Account Money Transfer]() | [Erdem Gürel](https://github.com/artam109)                | QA Engineer                |
| [US_607: Contact Information Update]()   | [Beyza Nur Er](https://github.com/beyzanurer)             | QA Engineer                |
| [US_608: Loan Application]()             | [Onur Girgin](https://github.com/Mednasa)                 | QA Engineer                |

## User Story Summary:

- US601 | User Registration: Create registration records for new users in ParaBank.
- US602 | User Login: Verify the login process for registered users.
- US603 | Bill Payment Functionality: Test payment processes for various bill types such as electricity, water, and gas
  bills.
- US604 | Account Creation: Test the creation of both checking and savings accounts.
- US605 | {NULL}
- US606 | Inter-Account Money Transfer: Testing user’s ability to transfer money between their own accounts.
- US607 | Contact Information Update: Test updating of user contact information.
- US608 | Loan Application: Test the loan application process and its outcomes.

---

### User Story (US601):

> > > As a user, I want to benefit from bank services by opening an account on the Para Bank website. When I complete
> > > the account opening process, I must verify that I have successfully registered. So I can access my private bank
> > > services.

![US_601_Reg](https://github.com/NigarAylaOzcanan/ParaBank_CucumberProject/assets/158833043/1fe4efef-ff66-44da-ac66-92658f1e5b6c)
### Acceptance Criteria (AC01):

1. The user must navigate to the ParaBank website.
2. The website must have a connection such as "register" or "sign up" on the home page.
3. The user must fill out the registration form and use information that is not valid in this form (for example, a false
   name and a false e-mail address).
4. After completing the registration form, the user must click on a button such as "submit" or "register".
5. The user must verify a successful registration process and see a message like "Your Account Was Created Successfully.
   You are now logged in."

### Preconditions:

- Internet access should be provided in the test environment.
- The browser to be used for the test (e.g., Chrome, Safari, or Firefox) must be installed and initiated.
- The user should be able to access https://parabank.parasoft.com/.

### Test Data:

All fields except for the phone number must be filled out with optional values.

- First Name: {OPTIONAL}
- Last Name: {OPTIONAL}
- Address: {OPTIONAL}
- City: {OPTIONAL}
- State: {OPTIONAL}
- Zip Code: {OPTIONAL}
- Phone #: {OPTIONAL}
- SSN: {OPTIONAL}
- Username: {OPTIONAL}
- Password: {OPTIONAL}
- Confirm Password: ''

### Priority:

This story is a high priority for new users to use the Para Bank website because an account opening process is a basic
step.

### Test Types:

Accounts, Smoke, Regression

### Scenarios:

**Scenario 1 Case 1: Creation of User Record**

    - The user navigates to the ParaBank website.
    - Click the "Register" link on the home page.
    - The user fills the areas given in the customer data.
    - Click the user register button.
    - The user is logged in the system with the information entered during registration.
    - The user confirms the message that it is successfully registered and logged.

---

### User Story (US602):

> > > As a user, I want to access my account by logging into the Para Bank website and perform my bank transactions. I
> > > need to confirm whether logging into the site is successful or unsuccessful by testing my login process with valid
> > > and
> > > invalid user information. So I can be sure that I have accessed the site safely.

![US_602_Login](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/600b1e32-a666-4c69-ab1e-b9f7768aba05)

![US_602_Login_Neg](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/882abda4-1bf0-4110-83aa-06b16f3b06f1)

### Acceptance Criteria (AC02):

1. The user must navigate to the ParaBank website.
2. The website must have a connection such as "Sign In" or "Login" on the home page.
3. The user must log in using the current user name and password combination.
4. The user must attempt to log in using an invalid user name or password combination.
5. After the login process, the user must verify a successful or unsuccessful input.

### Preconditions:

- This test requires successfully completing the story called "US701".

### Test Data:

- "Valid username and password combination"
- "Invalid username and password combination"

### Priority:

This story is a high priority for new users to use the Para Bank website because the entry process is a basic step.

### Test Types:

Accounts, Smoke, Regression

### Scenarios:

**Scenario 2 Case 1: Login with valid user information:**

    - The user navigates to the ParaBank website.
    - On the home page, click "Sign In" or "Login" link.
    - Login with a valid user name and password combination.
    - The user confirms that it has successfully entered.
    - The user switches the session with "Log Out" option.

**Scenario 2 Case 2: Login with invalid user information:**

    - The user navigates to the ParaBank website.
    - On the home page, click "Sign In" or "Login" link.
    - It logs in with an invalid user name or password combination (for example, wrong user name and wrong or empty password).
    - The user confirms an unsuccessful input and confirms the error message that appears on the screen.

---

### User Story (US603):

> > > As a user, I want to pay my invoices through the Para Bank website. I need to verify the invoice payment process
> > > of the system by paying different types of invoices (electricity, water, natural gas). So I can spend the time I
> > > spend
> > > on invoice transactions.

![US_603_BillPayment](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/d17c3a85-6161-4656-95ef-70004c730d53)

### Acceptance Criteria (AC03):

1. The user must have successfully entered the Para Bank website.
2. The user must be directed to the invoice payment (Bill Pay) page.
3. The user must test the functionality of the system by paying different types of invoices (electricity, water, natural
   gas).
4. After each invoice payment, the user must verify that the payment is successfully completed.
5. The user must verify that the account balance is updated after each payment process and the list of the paid invoice
   is updated.

### Preconditions:

- This test requires successfully completing the story called "US702".

### Test Data:

- Buyer Name: A username containing the invoice type (e.g., Enerjisa Electricity, İGDAŞ Natural Gas ...)
- Address: {random}
- City: {Random}
- Region: {random}
- Postal Code: {Random}
- Phone #: {random}
- Buyer Account #: {random}
- Verify the buyer account #: ''

### Priority:

This story is important to perform users' daily financial transactions, so it is a high priority.

### Test Types:

Payment, Smoke, Regression

### Scenarios:

**Scenario 3 Case 1: Electric Bill Payment:**

    - The user successfully logs in to the ParaBank website.
    - The user clicks the "Bill Pay" ("Invoice Payment") option from the menu on the website.
    - The user is directed to the invoice payment page.
    - The user also enters the type of invoice (electricity) he wants to pay into the recipient name (payee name) (for example, "Enerjisa Electricity Bill").
    - The user fills the invoice information in the customer datas with random {random} values.
    - The user enters the amount to be paid (for example, $ 85).
    - The user selects the account to pay.
    - The user clicks the "Payment" button to confirm the payment process.
    - The user confirms that the payment is successfully completed, the payment amount, and the payment account number.
    - The user clicks on the link "Accounts OverView".
    - User clicks on the payment account number.
    - The user confirms the payment date in the list, the payment name, and the payment amount in the list.

**Scenario 3 Case 2: Water Bill Payment:**

    - Repeat the steps from Case 1, replacing the type of invoice with water and adjusting the payment amount accordingly.

**Scenario 3 Case 3: Natural Gas Invoice Payment:**

    - Repeat the steps from Case 1, replacing the type of invoice with natural gas and adjusting the payment amount accordingly.

---

### User Story (US604):

> > > As a user, I want to be able to create futures and demand accounts. Thus, I can better organize my financial
> > > transactions and manage efficiently.

![US_604_NewAccount](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/59340293-1708-4e66-b5f7-bb035e8e5fc8)

![US_604_NewAccount2](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/d3a3a9ec-b31f-4d22-ae0b-8c867f700aa0)

### Acceptance Criteria (AC04):

1. The user must have logged in before starting the account creation process.
2. The user must be able to access the relevant menu or page to create futures or demand accounts.
3. The following options should be offered to the user on the account creation screen:
    - Account Type: Savings
    - Account Type: Checking
4. The user should select the account of the desired type (term or free).
5. When creating a bank account, the user should be able to see the message of how much starting balance should be.
6. The user should be able to select the requested account for starting balance during creating a bank account.
7. The user must enter the necessary information correctly and completely and click a button such as "open a new
   account".
8. When the account creation process is successfully completed, a confirmation message and new account number must be
   shown to the user.

### Preconditions:

- This test requires successfully completing the story called "US601".
- The user must be logged into the system.
- {min. Balance} is required.

### Test Data:

- Account Type:
    - CHECKING Accounts
    - SAVING Accounts
- Existing existing accounts (Every time this test works, a valuable account number occurs; the first account occurs
  during the register.)

### Priority:

This story is a basic step for users to manage their financial transactions. However, compared to other procedures, it
is currently a middle priority.

### Test Types:

Accounts, Smoke, Regression

### Scenarios:

**Scenario 4 Case 1: Checking Account:**

    - The user successfully logs in to the ParaBank website.
    - The user clicks on the "Open New Account" link from the menu on the website.
    - The user is directed to the bank account opening page.
    - The user selects the type of account from the Drop-Down menu as "checking".
    - The user will open a minimum balance in the new bank account {Min. Balance} receives the warning that it should be found.
    - The user selects the account from the Drop-Down menu to attract the minimum balance.
    - The user clicks the "Open New Account" button.
    - The user sees the account number by verifying that the new bank account has been created successfully.

**Scenario 4 Case 2: Savings Account:**

    - Repeat the steps from Case 1, selecting the account type as "Savings" from the drop-down menu.

---

### User Story (US605): {NULL}

---

### User Story (US606):

> > > As a user, I would like to transfer money from one of my current accounts to another. In this way, I can quickly
> > > meet my different financial needs.

![US_606_TransferFunds](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/7d8faa7b-830a-4e4e-8514-3633efed1a97)

### Acceptance Criteria (AC06):

1. The user must be logged in before initiating a money transfer between accounts.
2. The user should have access to the relevant menu or page for initiating a money transfer.
3. On the Money Transfer screen, the user should be prompted to provide the following information:
    - Sending Account (Account to be debited)
    - Receiving Account (Account that will receive the money)
    - Transfer Amount
4. The user must enter the required information for the transfer process accurately and completely.
5. To confirm and complete the money transfer process, there must be a "Transfer" button available.
6. The user should be able to click the "Transfer" button.
7. Once the transfer process is approved, a confirmation message or transaction details must be displayed to the user.
   This information should include details of the sending account, receiving account, and transfer amount.
8. The user should have the option to verify the transfer through an alternative method, such as checking the account
   summary, in addition to the confirmation message.

### Preconditions:

- This test requires successfully completing the story called "US701".
- The user must be logged into the system.
- After logging in, the user must successfully execute the "US704" case at least once.
- The user must have at least two accounts.
- The user must have a sufficient balance to be able to transfer.

### Test Data:

- Amount: {$OPTIONAL}
- Sender Account (from...): {Select}
- Receiver Account (to...): {Select}

### Priority:

Low

### Test Types:

Loan, Accounts, Regression

### Scenarios:

**Scenario 6 Case 1: Money transfer between my accounts:**

    - The user successfully logs in to the ParaBank website.
    - The user clicks on the "Money Transfer" (or "Transfer Funds") link from the website menu.
    - The user is directed to the fund transfer page.
    - The user selects a sender and receiver account from the drop-down menu.
    - The user enters the {$ OPTIONAL} amount to be transferred into the "Amount" field.
    - The user clicks the "Transfer" button.
    - The user confirms the transfer details in the confirmation message, including sender account, receiver account, and transfer amount.
    - The user clicks on the link of the newly created credit account number.
    - The user verifies the account details, including the account number, type, balance, and available balance.
    - The user confirms the absence of transactions in the account activity.

---

### User Story (US607):

> > > As a user, I want to update the contact information in my profile. In this way, my address, my phone number and
> > > other contact information will be up-to-date and correct, so that I can communicate with the bank in a smooth way
> > > when
> > > communicating and transactions.

![US_607_UpdateContact](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/00d9f013-9d46-45aa-b18e-793c9e90542c)

### Acceptance Criteria (AC07):

1. The user should have access to the account management panel after logging in.
2. Contact information provided in the customer data on the profile page should be editable.
3. When the user wishes to edit any communication information, they should be able to update the relevant field.
4. When the user clicks on an editing confirmation button, such as "Update Profile," the changes should be reflected in
   the database.
5. Upon successful update of the changes, a confirmation message must be displayed to the user.
6. The user should receive an appropriate error message if they enter incorrect or incomplete information.
7. The user logs out and logs back in. After this step, they should confirm that the updated contact information is
   correctly displayed on their profile page.

### Preconditions:

- This test requires successfully completing the story called "US601".
- The user must be logged into the system.

### Test Data:

All {_Optional_}:

- "First Name" (_Name_)
- "Last Name" (_Surname_)
- "Address" (_Address_)
- "City" (_City_)
- "State" (_State_)
- "Zip Code" (_Postal Code_)
- "Phone #" (_Phone number_)

### Priority:

Low

### Test Types:

Contact, Regression

### Scenarios:

**Scenario 7 Case 1: Update contact information:**

    - On the home page, the user finds and clicks "Update Contact Info" or similar.
    - The user displays the customer data on the "Update Profile" screen.
    - The user enters new information in the relevant fields to update the contact information.
    - The user clicks the "Update Profile" button to save user updates.
    - The user receives a confirmation message confirming the successful update process.
    - The user switches the session (logout) and re-entry (login).
    - The user confirms that the updated contact information is accurately displayed after logging in.

**Scenario 7 Case 2: Update contact information (Negative):**

    - On the home page, the user finds and clicks "Update Contact Info" or similar.
    - The user displays the customer data on the "Update Profile" screen.
    - The user deletes at least three optional fields from the contact information (leaving Null).
    - The user confirms the warning messages given in areas left empty.
    - The user tries to click the "Update Profile" button to save updates.
    - The user confirms that the "Update Profile" button does not make any changes on the page.

---

### User Story (US608):

> > > As a customer, I would like to apply for a loan through the Parabank website. This way, I can get the financing I
> > > need and follow the status of my application.

![US_608_Loan_Credit](https://github.com/NigarAylaOzcanan/LogicBreakers_DemoWebShopProject/assets/158833043/439462b4-ea09-41a8-a834-2234fd1e32a1)

### Acceptance Criteria (AC08):

1. The user should be able to apply for a loan.
2. The user should be able to see the result of the loan application immediately.
3. If the user is approved, they must receive the message "Approved"; if the application is rejected, they must receive
   the message "Denied".
4. If the application is approved, the user must be shown the new credit account number.
5. The user must verify that there is no operation in the new account activity.
6. If the application is rejected, the user should be able to see the reason for rejection.

### Preconditions:

This test requires the successful completion of the story called "US601".
The user must be logged into the system.

### Test Data:

- Loan Amount: (e.g., $2,000, $1,000,000)
- Down Payment: (e.g., $400, $10,000)
- The account to which the down payment will be withdrawn: {Account selection}

### Priority:

This story includes an important feature for users to manage their financial transactions. However, compared to other
stories, it is currently a low priority.

### Test Types:

Loan, Accounts, Regression

### Scenarios:

**Scenario 8, Case 1: Request Credit**

    - On the Parabank home page, the user clicks the "Request Loan" link.
    - The user enters the "$2000" and "Down Payment" field into the "Loan Amount" field.
    - The user selects an account number from the Drop-Down menu in the "From Account #".
    - The user clicks the "Apply Now" button.
    - The user confirms the following information that appears under the title "Loan Request Processed":
        - Loan Provider: Parabank, Status: Approved
    - The user confirms the message "Congratulations, Your Loan Has Been Approved.".
    - The user clicks on the link of the newly formed credit account number.
    - The user confirms the following information that appears under the title "Account Details":
        - Account Number: {New Credit Credit Account No}
        - Account Type: Loan
        - Balance: $2000.00
        - Available: $2000.00
    - The user confirms the message "No Transactions Found." under the title "Account Activity".

**Scenario 8, Case 2: Request Credit (Negative)**

    - On the Parabank home page, the user clicks the "Request Loan" link.
    - The user enters the "$1,000,000" and "Down Payment" field into the "Loan Amount" field.
    - The user selects an account number from the Drop-Down menu in the "From Account #".
    - The user clicks the "Apply Now" button.
    - The user confirms the following information that appears under the title "Loan Request Processed":
        - Loan Provider: Parabank, Status: Denied
    - The user confirms the message "You do not have sufficient Funds for the Given Down Payment.".

---

## Prerequisites

- Java Development Kit (JDK): Installed on your system for Java code writing and compilation.

- IDE (Integrated Development Environment): Choose IntelliJ IDEA, Eclipse, or NetBeans for Java development.

- Maven: Installed for dependency management and project build tasks.

- Git: Installed for version control, essential for managing your project's source code on GitHub.

- Selenium WebDriver: Familiarize yourself with its usage and basic automation techniques.

- TestNG: Understand its annotations and how to write test cases using this framework.

- Cucumber: Learn the basics of BDD and writing feature files and step definitions.

- Page Object Model (POM): Understand and implement this pattern in your test automation framework.

- Extent Report or Similar Reporting Tool: Familiarize yourself with integrating and generating test reports.

- JIRA & XRAY or Similar Test Management Tools: If using, ensure access and understand test case creation, management,
  and defect reporting.

- Logging with slf4j: Learn to configure and use for logging in your Java project.

## Technologies and Tools:

The basic technologies and tools to be used in this project include:

- Programming Language: Java

- Test Automation Tools: Selenium WebDriver

- Test Framework: TestNG

- BDD Framework: Cucumber

- Test Automation Pattern: Page Object Model (POM)

- Dependency Management and Build: Maven

- Reporting Tools: Extent Report or a similar reporting tool

- Version Control System: Git and GitHub

- Test Management Tools: JIRA & XRAY or similar tools

- Logging Interface: slf4j (Simple Logging Facade for Java)
-

## **Getting Started**

Follow these steps to get started with the project:

- Ensure that you have all the necessary prerequisites installed on your system, including JDK, IDE, Maven, Git, and
  required browser drivers.

- Clone the repository to your local machine:

- Set up the necessary dependencies in the project.

- Configure WebDriver for the desired browser (e.g., ChromeDriver, FirefoxDriver).

- Update the test scripts in the project to reflect the specific test scenarios and requirements.


## Contributing

Contributions are welcome! If you find any issues or want to add more tests, feel free to open a pull request.
