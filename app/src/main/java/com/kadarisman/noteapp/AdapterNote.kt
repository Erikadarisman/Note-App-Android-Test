package com.kadarisman.noteapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterNote : RecyclerView.Adapter<AdapterNote.noteVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): noteVH {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: noteVH, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class noteVH(item:View):RecyclerView.ViewHolder(item){
        fun bind(item: Note){

        }
    }

}