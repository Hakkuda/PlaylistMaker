package com.practicum.playlistmaker1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_settings)
        val backToMainButton = findViewById<View>(R.id.back_to_main_button)

        backToMainButton.setOnClickListener {
            this.finish()
        }

    }
}