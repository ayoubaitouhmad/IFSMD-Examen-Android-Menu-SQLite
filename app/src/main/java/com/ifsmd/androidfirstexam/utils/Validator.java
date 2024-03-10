package com.ifsmd.androidfirstexam.utils;

import android.util.Patterns;

public class Validator {


    public static boolean isValidEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
