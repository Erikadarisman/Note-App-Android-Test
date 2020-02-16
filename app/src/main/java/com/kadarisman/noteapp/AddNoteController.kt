package com.kadarisman.noteapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.post_note.*

class AddNoteController : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_note)

        val buttonPost = bt_post_note
        buttonPost.setOnClickListener {
            Toast.makeText(this,"Post Note!!!!",Toast.LENGTH_LONG).show()
            DummyData.addNote("hello World","skuyy living")
            println("tessss")
        }
    }
}