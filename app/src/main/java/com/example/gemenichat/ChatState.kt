package com.example.gemenichat

import android.graphics.Bitmap
import androidx.compose.runtime.MutableState
import com.example.gemenichat.data.Chat


data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt : String = "",
    val bitmap: Bitmap? = null

)