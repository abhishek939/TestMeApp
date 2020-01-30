Feature: Purchase
  Jon want to Purchase Headphones from test me app ,He open Testme app by puting url of TestMe ,
  when he will search for the headphones in search tab appropriate result should be display by testme app 
  then he will select headphones and click on add to cart as he did not do login ,login window will open then 
  he have to login first using his credentials ,onces he login He will search for the product add that product 
  into cart and do payment process 

  @tag1
  Scenario: Purchase
   Given John want want to Purchase Headphones from test me app
   When John Enter URL of Testme app 
   Then  Testme app will open
   When  John will click on all categories
   Then appropriate result should be display by testme app 
   When john Select product from dropdown list
   And John click on add to cart button
   Then Login page should open 
   When John Login Using his credentials
   Then John will search for the headphones in all categories
   And  John will select product 
   And John will click on add to cart
   Then John will click on cart Link which is on a page
And John will complete payment Process