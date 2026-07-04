package com.example.nexaai1.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nexaai1.ui.theme.NEXAAI1Theme

@Composable
fun ChatScreen(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "🤖 NEXA AI",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = "مرحبًا محمد 👋\nكيف أستطيع مساعدتك اليوم؟",
                modifier = Modifier.padding(16.dp)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text("اكتب رسالتك...")
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {},
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