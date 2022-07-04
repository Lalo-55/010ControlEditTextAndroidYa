package com.luismorales17106494.a010_controledittext

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a010_controledittext.databinding.ActivityMainBinding

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
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btVerificar.setOnClickListener() {
            if (binding.etUsuario.text.isNotBlank()) {

                if (binding.etContraseA1.text.toString() == binding.etContraseA2.text.toString() && binding.etContraseA1.text.isNotBlank()) {
                    Toast.makeText(this, "Ingresando..", Toast.LENGTH_SHORT).show()
                    binding.layout.setBackgroundColor(Color.GREEN)

                } else {
                    Toast.makeText(this, "Error al ingresar la contraseña", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Ingrese su usurario", Toast.LENGTH_SHORT).show()
            }

        }


    }
}