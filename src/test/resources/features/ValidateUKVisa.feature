Feature: Check UK Visa

  Background: On the UK Visa Check Page
    Given I am on the visa check page
    When I clicked the start now button
    Then I am on the country list page

  Scenario Outline: Japan and Study
    Given I provide a nationality of "<nationality>"
    And I select the "<reason>"
    And I state I am intending to stay for "<length>"
    When I submit the form
    Then I will be informed "<message>"

    Examples:
      | nationality | reason   | length               |  message                               |
      | Japan       | Study    | longer than 6 months |  You’ll need a visa to study in the UK |

  Scenario Outline: Japan and Tourism
    Given I provide a nationality of "<nationality>"
    And I select the "<reason>"
    When I submit the form
    Then I will be informed "<message>"

    Examples:
      | nationality | reason     |  message                                 |
      | Japan       | Tourism    |  You won’t need a visa to come to the UK |


  Scenario Outline: Russia and Tourism
    Given I provide a nationality of "<nationality>"
    And I select the "<reason>"
    And I state "<statement>"
    When I submit the form
    Then I will be informed "<message>"

    Examples:
      | nationality | reason   |  statement |  message                              |
      | Russia      | Tourism  |  NO        |  You’ll need a visa to come to the UK |
