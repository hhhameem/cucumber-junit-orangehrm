Feature: Invalid User Login

  Scenario Outline: User can not login with invalid username and password
    Given User visits the website
    When User inputs invalid "<username>" and "<password>"
    Then user can see error message
    Examples:
      | username | password |
      |user      | admin123 |
      |admin     | 123      |