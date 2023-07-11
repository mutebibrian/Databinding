package com.kotlinseries.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.kotlinseries.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)-Removed
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //So I'm telling Android Studio that this binding object that we've created from the activity main binding
        //class is linked to this activity underscore main layout.
        //initialize the widgets
        //val editText:EditText=findViewById(R.id.editTextText)
        //val button:Button =findViewById(R.id.button)
        //val text:TextView= findViewById(R.id.textView)
        //so every time we find view by id function to get refernce
        //to a few Android system has to go through the view hierarchy and find it at runtime.
        //So we will get rid of final view by ID by by using the data binding library.
        //So I will continue now without using the data binding and I will show you how this
    // app will function and behave
        //NOTE :Now, I told you that using the find view by ID method Android system has to go through all the view
        //hierarchy every time it will refresh the display, go through all the hierarchy to find all these views.
        //And this is a very big problem if you are building a big application containing hundreds of views.
      binding.button.setOnClickListener {
          //We are going to use the IDS Directly
          //we use the binding object.widget id
          val enteredtext : String = binding.editTextText.text.toString()
        //          text.setText((enteredtext))
          binding.textView.setText(("Hallo $enteredtext"))

          //binding as an object that stores the IDs of these views in the layout.
      }//QN.How can we remove binding on all our widget ids to reduce on the bolier plate code
        //ANS.binding.apply{----}


//This is our application lets move on how to add data Binding

    }
}
//So in high refresh rate mobiles like 120 U.

//Android system has 8 milliseconds to find all the views and set them correctly in their variables,
//and this will make a very big problem.
//And A and RS and the application crashes.
//So Android developers invited something called data binding.