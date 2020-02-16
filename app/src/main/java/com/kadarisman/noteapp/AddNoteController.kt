package com.kadarisman.noteapp

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.post_note.*

class AddNoteController : AppCompatActivity() {

    private var titleEditText: EditText? = null
    private var descEditText: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_note)

        titleEditText = et_title
        descEditText = et_desc



        val buttonPost = bt_post_note
        buttonPost.setOnClickListener {
            Toast.makeText(this,"Post Note!!!!",Toast.LENGTH_LONG).show()
            DummyData.addNote(titleEditText!!.text.toString(),descEditText!!.text.toString())
//            println(titleEditText!!.text.toString())
        }
    }
}