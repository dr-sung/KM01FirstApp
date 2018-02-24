package edu.uco.hsung.km01_firstapp

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener {
            val message: String?
            if (password.text.toString() == getString(R.string.secret_password)) {
                message = getString(R.string.greeting, username.text.toString())
            } else {
                message = getString(R.string.incorrect_pass_message)
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
