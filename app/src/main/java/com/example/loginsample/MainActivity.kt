package com.example.loginsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {

        val username    = ui_username.text
        //val password  = uipassword.text;
        val confirm     = getString(R.string.confirm)

        // TODO: Validation to handle username/password authentication
        Toast.makeText(this@MainActivity, "$confirm $username", Toast.LENGTH_LONG).show()
    }
}
