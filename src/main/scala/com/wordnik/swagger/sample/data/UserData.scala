package com.wordnik.swagger.sample.data

import collection.mutable.ListBuffer
import com.wordnik.swagger.sample.model.{Category, User, Pet}

/**
 * Provides test data for user resource
 * 
 * User: ramesh
 * Date: 8/1/11
 * Time: 10:09 AM
 */

class UserData {

    val users:ListBuffer[User] = new ListBuffer[User]()

    {
      users += createUser(1, "user1", "first name 1", "last name 1", "email1@test.com", "123-456-7890", 1)
      users += createUser(2, "user2", "first name 2", "last name 2", "email2@test.com", "123-456-7890", 2)
      users += createUser(3, "user3", "first name 3", "last name 3", "email3@test.com", "123-456-7890", 3)
      users += createUser(4, "user4", "first name 4", "last name 4", "email4@test.com", "123-456-7890", 1)
      users += createUser(5, "user5", "first name 5", "last name 5", "email5@test.com", "123-456-7890", 2)
      users += createUser(6, "user6", "first name 6", "last name 6", "email6@test.com", "123-456-7890", 3)
      users += createUser(7, "user7", "first name 7", "last name 7", "email7@test.com", "123-456-7890", 1)
      users += createUser(8, "user8", "first name 8", "last name 8", "email8@test.com", "123-456-7890", 2)
      users += createUser(9, "user9", "first name 9", "last name 9", "email9@test.com", "123-456-7890", 3)
      users += createUser(10, "user10", "first name 10", "last name 10", "email10@test.com", "123-456-7890", 1)

    }

    def findUserByName(username:String):User = {
      for (user <- users){
        if (user.getUsername() == username){
          return user
        }
      }
      null
    }

    def addUser(user:User):Unit = {
      users += user
    }

    def removeUser(username:String):Unit = {
      for (user <- users){
        if (user.getUsername() == username){
          users -=  user
        }
      }
    }

    private def createUser(id:Long, username:String, firstName:String, lastName:String, email:String, phone:String, userStatus:Int):User = {
      var user = new User
      user.setId(id)
      user.setUsername(username)
      user.setFirstName(firstName)
      user.setLastName(lastName)
      user.setEmail(email)
      user.setPassword("XXXXXXXXXXX")
      user.setPhone(phone)
      user.setUserStatus(userStatus)
      user
    }
}