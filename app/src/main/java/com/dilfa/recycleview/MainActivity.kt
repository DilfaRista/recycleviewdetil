package com.dilfa.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{

        val INTENT_PARCELABLE = "OBJECT_INTENT"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.pppa,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.pppa,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
            Superhero(
                R.drawable.ppu,
                "Lorem ",
                "Lorem ",
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.tv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, detail_activity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}