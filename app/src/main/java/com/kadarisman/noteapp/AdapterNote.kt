package com.kadarisman.noteapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_content.view.*

class AdapterNote(
    private val data: ArrayList<Note>,
    private val onClick:(Note) -> Unit //callback
) : RecyclerView.Adapter<AdapterNote.noteVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): noteVH {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_content, parent, false)
        return noteVH(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: noteVH, position: Int) {
        holder.bind(data[position])
    }

    inner class noteVH(item:View):RecyclerView.ViewHolder(item){
        val card = item.cardViewId
        val title: TextView = item.text_title
        val desc= item.text_desc
        fun bind(item: Note){
            title.text = item.title
            desc.text = item.desc
            card.setOnClickListener {
                onClick.invoke(item)
            }
        }
    }

}