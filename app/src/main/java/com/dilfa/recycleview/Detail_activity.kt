package com.dilfa.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.dilfa.recycleview.MainActivity
import com.dilfa.recycleview.R
import com.dilfa.recycleview.Superhero

class detail_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgSuperhero = findViewById<ImageView>(R.id.tv_item_desription_image)
        val nameSuperhero =findViewById<TextView>(R.id.tv_deskripsiname)
        val descSuperhero =findViewById<TextView>(R.id.tv_deskripsi)

        imgSuperhero.setImageResource(superhero?.imageSuperhero!!)
        nameSuperhero.text = superhero.nameSuperhero
        descSuperhero.text = superhero.descSuperhero
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}