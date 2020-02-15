package com.kadarisman.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Note> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = DummyData.getDataNote()

        list.addAll(data)

        val adapterNote = AdapterNote(list)
        RV_content.apply {
//            layoutManager = LinearLayoutManager(context)
//            setHasFixedSize(true)
//            adapter = academyAdapter
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = adapterNote
        }

    }


}
