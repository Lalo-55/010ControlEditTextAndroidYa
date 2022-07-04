package com.luismorales17106494.a010_controledittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
10 - Control EditText
Desde el primer problema hemos estado utilizando el control que permite en Android ingresar
valores por teclado. La clase que administra la entrada de caracteres por teclado es EditText.
Pero en la palette de componentes en la pestaña "Text" vemos que hay muchos tipos de EditText:
 */
/*
Problema
Confeccionar una aplicación para Android que permita ingresar el nombre de usuario y su clave
en dos controles de tipo EditText.
Verificar al presionar un botón si se ingresó algún texto en la clave.
Si no se ingresó texto informar mediante una notificación dicha situación.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}