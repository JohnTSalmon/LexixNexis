Feature: Lexis Nexis Risk Solutions Home Page

  Scenario: Test Risk Solutions Links
    Given I open the Risk Solutions Page
    Then I should see the following interactable Industry links :
      | LinkText                     | Link                                                       |
      | Financial Services           | https://risk.lexisnexis.co.uk/financial-services           |
      | Insurance                    | https://risk.lexisnexis.co.uk/insurance                    |
      | Life and Pensions            | https://risk.lexisnexis.co.uk/life-and-pension             |
      | Corporations and Non-Profits | https://risk.lexisnexis.co.uk/corporations-and-non-profits |
    And I should see the following interactable Financial Services links :
      | LinkText                         | Link                                                                                        |
      | Financial Crime Compliance       | https://risk.lexisnexis.co.uk/corporations-and-non-profits/financial-crime-compliance       |
      | Fraud and Identity Management    | https://risk.lexisnexis.co.uk/corporations-and-non-profits/fraud-and-identity-management    |
      | Customer Data Management         | https://risk.lexisnexis.co.uk/corporations-and-non-profits/customer-information-management  |
      | Credit Risk Assessment           | https://risk.lexisnexis.co.uk/corporations-and-non-profits/credit-risk-assessment           |
      | Collections and Recovery         | https://risk.lexisnexis.co.uk/corporations-and-non-profits/collections-and-recovery         |
      | Investigations and Due Diligence | https://risk.lexisnexis.co.uk/corporations-and-non-profits/investigations-and-due-diligence |
      | Risk Orchestration               | https://risk.lexisnexis.co.uk/corporations-and-non-profits/risk-orchestration               |