Feature: Test feature

  Scenario: Test scenario
    Given The user navigates to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When The user types "admin" as username
    And The user types "admin123" as password
    Then The user clicks login button

