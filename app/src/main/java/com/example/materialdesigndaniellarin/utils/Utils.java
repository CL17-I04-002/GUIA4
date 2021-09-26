package com.example.materialdesigndaniellarin.utils;

import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean verifyEditText(EditText editText){
        if(editText.getText().toString().isEmpty()){
            editText.setError("Este campo es requerido");
            return false;
        }else if(!verifyChart(editText)){
            editText.setError("Solo se permiten letras");
            return false;
        }
        return true;

    }
    public static boolean verifyChart(EditText editText){
        //Expresion regular para validar que solo acepte letras
        Pattern ps = Pattern.compile("^[a-zA-Z]+$");
        Matcher ms = ps.matcher(editText.getText().toString());
         boolean bs = ms.matches();
         return bs;
    }
}
