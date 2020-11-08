package com.gabrielaraujoz.androidchallenge.register

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gabrielaraujoz.androidchallenge.HomeActivity
import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.login.MainActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    private lateinit var name: TextInputEditText
    private lateinit var email: TextInputEditText
    private lateinit var password: TextInputEditText
    private lateinit var confirmPassword: TextInputEditText
    private lateinit var registerButton: MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        name = findViewById(R.id.txtInputRegisterName)
        email = findViewById(R.id.txtInputRegisterEmail)
        password = findViewById(R.id.txtInputRegisterPassword)
        confirmPassword = findViewById(R.id.txtInputRegisterRepeatPassword)
        registerButton = findViewById(R.id.btnRegisterRegister)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setupButton()

    }

    fun setupButton() {
        registerButton.setOnClickListener() {
            validaRegistro()
        }
    }

    fun validaRegistro() {
        when {
            name.text.toString().isEmpty() -> {
                name.error = "Campo vazio"
            }
            email.text.toString().isEmpty() -> {
                email.error = "Campo vazio"
            }
            password.text.toString().trim().isEmpty() -> {
                password.error = "Campo vazio"
            }
            password.text.toString().trim().length < 6 -> {
                password.error = "A senha digitada deve ter pelo menos 6 caracteres"
            }
            confirmPassword.text.toString().trim().isEmpty() -> {
                confirmPassword.error = "Campo vazio"
            }
            confirmPassword.text.toString().trim().length < 6 -> {
                confirmPassword.error = "A senha digitada deve ter pelo menos 6 caracteres"
            }
            password.text.toString().trim() != confirmPassword.text.toString().trim() -> {
                confirmPassword.error = "As duas senhas devem ser iguais"
                Toast.makeText(this, "As duas senhas devem ser iguais", Toast.LENGTH_SHORT).show()
            }
            else -> {
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}