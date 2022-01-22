                                                                    package com.rawanalduhyshi.productwithrecycleviewwithintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

                                                                    class PhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)

        val b = intent.extras
        var name = " "
        var price = " "// or other values

        if (b != null)
           name = b.getString("name").toString()
       var phoneName = findViewById<TextView>(R.id.phone_name)
        phoneName.text = name
        if (b != null)
            price= b.getString("price").toString()
            var phonePrice= findViewById<TextView>(R.id.phone_price)
            phonePrice.text=price



    }
}