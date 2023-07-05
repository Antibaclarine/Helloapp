package com.example.hello

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.hello.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

clearErrorsOnType()

    }
    fun clearErrorsOnType() {
        binding.etFirstName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilFirstName.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })

           binding.etLastName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilLastName.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })
               binding.etPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.etPassword.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })
                   binding.etEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.etEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })
                       binding.etPasswordConfirmation.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.etPasswordConfirmation.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })
    }


    override fun onResume() {
        super.onResume()
//           binding .castviews()
            binding.tvLogin.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
                binding.btnSignUp.setOnClickListener {
            validateSignUp()
        }
    }
fun  castViews(){

}
    @SuppressLint("SuspiciousIndentation")
    fun validateSignUp(){
       val firstName=binding.etFirstName.text.toString()
        val lastName=binding.etLastName.text.toString()
        val email=binding.etEmail.text.toString()
        val password=binding.etPassword.text.toString()
        val passwordConfirmation=binding.etPasswordConfirmation.text.toString()
        var error=false
        if (firstName.isBlank()){
            binding.tilFirstName.error="First Name is required"
        }
        if (lastName.isBlank()){
            binding.tilLastName.error="Last Name is required"
            error=true
        }
        if (email.isBlank()){
            binding.tilEmail.error="email is required"
            error=true
        }
        if (password.isBlank()){
            binding.tilPassword.error="password is required"
            error=true
        }
        if (passwordConfirmation.isBlank()){
            binding.tilPasswordConfirmation.error="password confirmation is required"
            error=true
        }
        if (password !=passwordConfirmation){
            binding.tilPasswordConfirmation.error="Password and password confirmation are not matching"
            error=true
        }
        if (!error){
        Toast.makeText(this,"$firstName $lastName $email",Toast.LENGTH_LONG)
            .show()
    }
}
}
