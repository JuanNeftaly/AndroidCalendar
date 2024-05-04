package com.neftaly.calendar

import CustomDatePicker
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.neftaly.calendar.ui.theme.CalendarTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalendarTheme {
                Scaffold {
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()

                    ) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            // call calendar
                            val date = remember { mutableStateOf(LocalDate.now()) }
                            CustomDatePicker(value = date.value, onValueChange = { date.value = it })
                        }
                    }
                }

            }
        }
    }
}



