Feature: Nemi do wonders.

@Browser1
Scenario: Testing hooks
Given I have hooks 
When I wrote One
Then They should run fine

@Browser(name="Hello")
Scenario: Hook scenario
Given I hook
"""
Multiline data
"""
When I can hook
Then I will hook

Scenario: SnippetType
Given I have a snippet type
When I write something 
Then something else happens