Feature: Cash Withdrawal

  Scenario Outline: Withdraw fixed amount
    Given I have <Balance> in my account
    When I choose to withdraw the fixed amount of <Withdrawal>
    Then I should receive <Outcome>
    And the balance of my account should be <Remaining>

    Examples:
      | Balance | Withdrawal | Remaining | Outcome              |
      | $500    | $50        | $450      | receive $50 cash     |
      | $500    | $100       | $400      | receive $100 cash    |
      | $500    | $200       | $300      | receive $200 cash    |
      | $100    | $100       | $300      | see an error message |


  Scenario: Withdraw fixed amount of $50
    Given I have $500 in my account
    Given I have authenticated with the correct PIN
    When I choose to withdraw the fixed amount of $50
    Then I should receive $50 cash
    And the balance of my account should be $450
