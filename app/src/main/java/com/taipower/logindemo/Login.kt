package com.taipower.logindemo

/**
 * Created by taipower on 22/1/2018 AD.
 */
object Login{
    fun isPasswordValid(password: String): Boolean{
        return password.length > 4
    }

    fun isEmailValid(email: String): Boolean {
        return email.contains("@")
    }

    fun authorize(email:String,password:String):Boolean{
        if (email == "foo@example.com" && password == "hellojaa"){
            return true
        }else{
            return false
        }
    }
}