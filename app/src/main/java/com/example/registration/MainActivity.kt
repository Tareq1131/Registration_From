package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var FastName: EditText
    private lateinit var LastName: EditText
    private lateinit var emailET: EditText
    private lateinit var passET: EditText
    private lateinit var regBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FastName = findViewById(R.id.nameInput)
        LastName = findViewById(R.id.lastName)
        emailET = findViewById(R.id.emailTx)
        passET = findViewById(R.id.passwordTv)
        regBtn = findViewById(R.id.Btn)

        regBtn.setOnClickListener {
            val Name = FastName.text.toString()
            val LastName = LastName.text.toString()
            val Email = emailET.text.toString()
            val Password = passET.text.toString()

            if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
                emailET.error = "invalid email address"
                return@setOnClickListener
            }
            if (Email.isEmpty()) {
                emailET.error = "This field must not be empty"
                return@setOnClickListener
            }
            if (Password.isEmpty()) {
                passET.error = "This field must not be empty"
                return@setOnClickListener
            }

           //Explicit intent
           val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("name",Name)
            intent.putExtra("lastname",LastName)
            intent.putExtra("email",Email)
            intent.putExtra("password",Password)
            startActivity(intent)


        }
    }
}