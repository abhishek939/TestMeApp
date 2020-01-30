@search
Feature: Search

In order to purchase products from TestMeApp
As a user
I need to search for the product

Business Rule:
        - registered have to enter only first 4 charecters  of the product name
        - product should be available in app
    
Question:
       - if the product is not available in the app
       
 Scenario Outline: User have to search the product
 
 Given user is on home page
 When  user enter the "<value>" in search
 #When  user selects the name in dropdown
 And  user clicks on find details
 And  user clicks on addtocart
 Then product should be added to the cart

Examples:
|value|
|Head|