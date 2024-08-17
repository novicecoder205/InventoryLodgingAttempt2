package com.rkpandey.roomdatabase.presentation

import com.rkpandey.roomdatabase.data.Note

sealed interface NotesEvent {
    object SortNotes: NotesEvent

    data class DeleteNote(val note: Note): NotesEvent

    data class SaveNote(
        val title: String,
        val description: String,
        val quantity: String,
        val location: String,
        val purpose: String
    ): NotesEvent
}
