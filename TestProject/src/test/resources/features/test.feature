@Sanity
Feature: Login functionality

#  @Test_1
#  Scenario Outline: Login with admin user
#    Given User login with "admin"
#    #Then Verify login screen with user "admin"
#    Examples:


  @Test_2
  Scenario Outline: Login with different user
    Given User login with "<UserName>"
    #Then Verify login screen with user "<UserName>"
    Examples:
      | UserName |
      | Pankaj   |
      | Rohit    |
