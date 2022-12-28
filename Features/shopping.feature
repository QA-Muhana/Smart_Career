Feature: Valid user able to purchase the men jacket from eCommerce web site 


Description: "online user can register luma eCommerce web site to purchase"
             "return, deliver, exchange, clearence, sale etc "
             
@Sanity
Scenario Outline: User can login the application with valid credential and purchase the specific 
           mens jacket
           
Given User already login the application and verify the login info in the landing page
When user should be able to <specific> jacket from men module
And user verify the jacket name on the <specific> list
And user should be able to select the "<size>" and "<color>" and "<quantity>" and click on the add to cart
And user able to click on the cart and checkout
And user able to enter the shipping details and click on the next
And user able to verify the shipping address and place the order
Then User should be able to verify the order number and get text on the screen "Thank you for your purchase!" 


Examples:   

|          specific         |size|   color    |    quantity   |
|Jupiter All-Weather Trainer| M  |  Blue      |    1          |