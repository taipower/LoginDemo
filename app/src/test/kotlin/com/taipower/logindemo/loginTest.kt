package com.taipower.logindemo

import android.util.Log
import org.junit.Test
import kotlin.test.assertFails
import org.junit.Before
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by taipower on 22/1/2018 AD.
 */
class loginTest{
    @Test
    fun shouldPasswordValid(){
        var passwordTest = "tai"
        assertFalse { Login.isPasswordValid(passwordTest) }
        passwordTest = "taipower"
        assertTrue { Login.isPasswordValid(passwordTest) }
    }

    @Test
    fun shouldEmailValid(){
        var emailTest = "foo"
        assertFalse { Login.isEmailValid(emailTest) }
        emailTest = "foo@example.com"
        assertTrue { Login.isEmailValid(emailTest) }
    }

    @Test
    fun shouldBeAuthorize(){
        var emailTest = "foo@example.com"
        var passwordTest = "hellojaa"
        assertTrue { Login.authorize(emailTest,passwordTest) }
        emailTest = "foo2@example.com"
        passwordTest = "helloj"
        assertFalse { Login.authorize(emailTest,passwordTest) }
    }

}