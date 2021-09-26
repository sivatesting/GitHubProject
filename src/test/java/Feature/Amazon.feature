@featureTag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: Login amazon
    Given Login into amazon site

  @scenarioTag1
  Scenario Outline: Search Products
    Given Get input from User to search products <Products>

    #And some other precondition
    #When I complete action
    #Then I validate the outcomes
    Examples: 
      | Products |
      | Laptop  |
