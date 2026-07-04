package com.example.nexaai1.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.nexaai1.model.Message

class ChatViewModel : ViewModel() {

    val messages = mutableStateListOf<Message>()

    fun sendMessage(text: String) {
        if (text.isNotBlank()) {
            messages.add(
                Message(
                    text = text,
                    isUser = true
                )
            )
        }
    }
}