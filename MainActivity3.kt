package com.example.project101

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    private var petHealth = 100
    private var petCleanliness = 50
    private var petHunger = 50


    private fun animateImageChange(petImage: ImageView?, dogClamingIcon: Any) {

    }

    fun onCreat(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main2)


       //Get all the buttons and text views
       val btnEat = findViewById<Button>(R.id.btn_eat)
       val btnClean = findViewById<Button>(R.id.btn_clean)
       val btnPlay = findViewById<Button>(R.id.btn_play)
       val txtHunger = findViewById<EditText>(R.id.txt_eat)
       val txtClean = findViewById<EditText>(R.id.txt_clean)
       val txtHappy = findViewById<EditText>(R.id.txt_play)
       val petImage = findViewById<ImageView>(R.id.pet_image2)


        //  Set all the initial text values
        txtHunger.setText(petHunger.toString())
        txtClean.setText(petCleanliness.toString())
        txtHappy.setText(petHealth.toString())

        //Handle all button clicks
        btnEat.setOnClickListener {
                petHunger -= 10
                petCleanliness += 10
                petHealth += 5


            btnClean.setOnClickListener {
                petCleanliness += 10
                 petHealth+= 10


    txtClean.setText(petCleanliness.toString())
    animateImageChange(petImage, R.drawable.dog_claming_icon)


    btnPlay
        petHealth += 10
        petHunger += 5
        petCleanliness -= 5
        txtHappy.setText(petHealth.toString())
        animateImageChange(petImage, R.drawable.happy_dog_icon)
    }


 fun animateImageChange(imageView: ImageView, newImageResource: Int) {
     val animation = AlphaAnimation(0.0f, 1.0f)
     animation.duration = 500
     animation.fillAfter = true
     imageView.startAnimation(animation)
     imageView.setImageResource(newImageResource)
 }}}}

