package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

  private  lateinit var nameTv:TextView
  private lateinit var lastnameTv:TextView
 private  lateinit var emailTv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        nameTv= findViewById(R.id.nameTv)
        lastnameTv = findViewById(R.id.lastnameTv)
        emailTv = findViewById(R.id.emailTv)


       val name = intent.getStringExtra("name")
       val lastname1 = intent.getStringExtra("lastname")
       val email = intent.getStringExtra("email")

        nameTv.text =" $name"
        lastnameTv.text =" $lastname1"
        emailTv.text = "  $email"

    }
}