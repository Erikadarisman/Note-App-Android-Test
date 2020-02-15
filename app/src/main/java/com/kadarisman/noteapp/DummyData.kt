package com.kadarisman.noteapp

object DummyData {
    fun getDataNote(): List<Note> {

        val dataNote = ArrayList<Note>()

        dataNote.add(
            Note(
                "Note title 1",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
            )
        )

        dataNote.add(
            Note(
                "Note Title 2",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
            )
        )

        dataNote.add(
            Note(
                "Note Title 3",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
            )
        )



        return dataNote
    }

}