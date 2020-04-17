Feature: Search by keyword

  Background: On the UK Visa Check Page
    Given I am on the visa check page
    When I clicked the start now button
    Then I am on the country list page

  Scenario: Japan and Study
    Given I provide a nationality of Japan
    And I select the "Study"
    And I state I am intending to stay for more than 6 months
    When I submit the form
    Then I will be informed "You’ll need a visa to study in the UK"

