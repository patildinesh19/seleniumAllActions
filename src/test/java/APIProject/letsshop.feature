Feature: login into the Lets shop application

Background:
    Given url letsshopbaseurl

    * def loginRequest = read("classpath:payload/letsshoplogin.json")

Scenario: Login into Lets Shop application

    And path 'auth/login'

    And headers {Accept: 'application/json'}

    And request loginRequest

    When method POST

    Then status 200

    And print response