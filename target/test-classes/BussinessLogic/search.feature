 Feature: Search India on Google website and verify search.
   @Regression
  Scenario Outline: Search keyword on Google website and verify it.
    
    When I navigating to Google website  
    And I enter <country> in search textbox
    And I click at Search button
    Then I verify <country> on search page
  
		
  Examples:
    | country |
    | India   |
   | china   |
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
