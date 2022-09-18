package com.mycompany.springboot_crud;

public class Procedure {
    // this is a class made for my own reference to tell how the spring boot project is created from start
    // all the line of code here will be commented and is just for my own purpose
    // STEP 1 -->
    // Create a database schema and add database to the project(using mysql in this project) and then add schema created to the database

    // Step 2 -->
    // in application.proprties file configure the database

    //Step 3 -->
    // after configuring the application.properties file for the database just code the home page for application
    // 1) Code the main controller class
    // 2) code the index.html

    //Step 4 -->
    // cofigure intellij idea for spring boot dev tools
    // press the shift key twice and type resistry and search for compiler.auto.make.allow.when.app.running enable and then set things in seetings build > compiler > build project automatically


    //Step 5
    // in order to use bootstrap we need to add some additional dependencies

    //Step 6
    // Code the data access layer (Repository Layer) this layer is for the user module
    // 1) Code User entity class that maps to users table in  the database (after this create a new java interface for the user repository )
    // 2) Code UserRepository interface to use APIs of Spring Data JPA this interface will extend the crud repository provided by the spring data jpa
    // 3) Run the application to let Hibernate creates the table

    // Step 7 (FOR TEST DRIVEN DEVELOPMENT)
    // Write some code unit tests for data acess layer
    // use spring data jpa test
    // test crud operations on users
    // run test against real database
    // CREATE A TEST CLASS IN THE TEST FOLDER

    //Step 8
    // Now code the front page (User Listing Page)
    // create a business class (UserService)
    // create a new controller class for the user module (User Controller)
    // create the page rendered by the handler method of the user controller class
    // once this html page is created run the test add method and add one user

    //Step 9
    // code the add new user function
    // create the second handler method(showNewForm()) in the user controller class for taking the new user details
    // create the new handler method to save the details taken in the above method to the database
}
