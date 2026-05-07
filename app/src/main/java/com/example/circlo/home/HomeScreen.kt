package com.example.circlo.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

data class Event (
    val title : String,
    val date : String,
    val location : String
)

@Composable
fun HomeScreen() {
    val eventList = listOf(
        Event(
            title = "Green Community Walk",
            date = "Oct 24, 5:00 PM",
            location = "Jakarta Selatan"
        ),
        Event(
            title = "Acoustic Garden Night",
            date = "Oct 26, 7:00 PM",
            location = "Cipete Jakarta Selatan"
        )
    )
}