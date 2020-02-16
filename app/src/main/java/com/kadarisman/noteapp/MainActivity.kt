package com.kadarisman.noteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        val adapterNote = AdapterNote(
            list,
            ::onClick
        )
        RV_content.apply {
            layoutManager = GridLayoutManager(context,2)
            setHasFixedSize(true)
            adapter = adapterNote
        }

        val floatButton = floating_add
        floatButton.setOnClickListener {
//            Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show()
            addNote()
        }


    }

    private fun onClick(data: Note){
        Toast.makeText(this,"{$data}",Toast.LENGTH_SHORT).show()
    }

    private fun  addNote(){
        val intent = Intent(this,AddNoteController::class.java)
        startActivity(intent)
    }


}
