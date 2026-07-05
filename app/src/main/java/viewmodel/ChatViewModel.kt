package com.example.nexaai1.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.nexaai1.model.Message

class ChatViewModel : ViewModel() {

    val messages = mutableStateListOf<Message>()

    fun sendMessage(text: String) {

        if (text.isBlank()) return

        // رسالة المستخدم
        messages.add(
            Message(
                text = text,
                isUser = true
            )
        )

        // رد مؤقت من NEXA AI
        messages.add(
            Message(
                text = getBotReply(text),
                isUser = false
            )
        )
    }

    private fun getBotReply(userMessage: String): String {

        return when (userMessage.lowercase()) {

            "السلام عليكم" ->
                "وعليكم السلام ورحمة الله وبركاته 🌹"

            "مرحبا" ->
                "أهلاً بك يا محمد 👋"

            "كيف حالك" ->
                "أنا بخير، شكراً لسؤالك 😊"

            else ->
                "ما زلت في مرحلة التطوير، لكن قريبًا سأجيب باستخدام الذكاء الاصطناعي الحقيقي 🤖"
        }
    }
}