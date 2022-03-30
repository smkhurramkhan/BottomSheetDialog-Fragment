package com.example.bottomsheetdialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var favouritePostBottomSheet: MyBottomSheetDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        favouritePostBottomSheet = MyBottomSheetDialog()


        val btnOpen = findViewById<Button>(R.id.openBottomSheet)

        btnOpen.setOnClickListener {
            if (!favouritePostBottomSheet?.isVisible!!)
                favouritePostBottomSheet?.show(
                    supportFragmentManager,
                    ""
                )
        }
    }
}