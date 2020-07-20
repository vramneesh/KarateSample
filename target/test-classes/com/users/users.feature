Feature: sample karate test script

  Background:
    * def absurl =  'https://reqres.in/api/users/2'
    * def help = function(args){ return com.utils.HelperClass.readFile(args)}

  Scenario: get all users and then get the first user by id
    * def one = call help 'FILE_1.txt'
    * def two = call help 'FILE_2.txt'
    Given url absurl
    When method get
    Then status 200
    And match one == two


