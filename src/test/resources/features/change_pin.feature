#Feature: Change PIN
#
#  In order to be able to change it to something they can easily
#  remember, customers with new bank cards need to be able to
#  change their PIN using the ATM.
#
#  Background:Insert a newly issued card and sign in
#    Given I have been issued a new card
#    And I insert the card, entering the correct PIN
#    And I choose "Change PIN" from the menu
#
#  Scenario: Change PIN successfully
#    When I change the PIN to 9876
#    Then the system should remember my PIN is now 9876
#
#  Scenario: Try to change PIN to the same as before
#    When I try to change the PIN to the original PIN number
#    Then I should see a warning message
#    And the system should not have changed my PIN