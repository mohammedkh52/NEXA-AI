package com.example.nexaai1.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.nexaai1.ui.components.MessageBubble
import com.example.nexaai1.ui.theme.NEXAAI1Theme
import com.example.nexaai1.viewmodel.ChatViewModel

@Composable
fun ChatScreen(
    modifier: Modifier = Modifier,
    chatViewModel: ChatViewModel = viewModel()
) {

    var text by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "🤖 NEXA AI",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "مرحبًا محمد 👋\nكيف أستطيع مساعدتك اليوم؟",
                modifier = Modifier.padding(16.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {

            items(chatViewModel.messages) { message ->
                MessageBubble(message = message)
            }

        }

        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text("اكتب رسالتك...")
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                chatViewModel.sendMessage(text)
                text = ""
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("إرسال")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    NEXAAI1Theme {
        ChatScreen()
    }
}