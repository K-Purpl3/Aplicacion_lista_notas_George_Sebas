package com.example.aplicacion_lista_notas_george_sebas.ui.theme

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class NoteViewModel : ViewModel() {
    private val _notes = mutableStateListOf<String>()
    val notes: List<String> = _notes

    fun addNote(note: String) {
        if (note.isNotBlank()) {
            _notes.add(note)
        }
    }

    fun removeNote(note: String) {
        _notes.remove(note)
    }
}