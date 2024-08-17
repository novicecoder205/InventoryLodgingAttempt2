package com.rkpandey.roomdatabase.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.rkpandey.roomdatabase.data.Note

data class NoteState(

    val notes: List<Note> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val description: MutableState<String> = mutableStateOf(""),
    val quantity: MutableState<String> = mutableStateOf(""),
    val location: MutableState<String> = mutableStateOf(""),
    val purpose: MutableState<String> = mutableStateOf("")



)