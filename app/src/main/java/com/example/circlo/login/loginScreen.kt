package com.example.circlo.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEAF7FA))
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(70.dp))

            Text(
                text = "CIRCLO",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0D4B73)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Temukan event gratis, gabung,\ndan terhubung bersama.",
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(40.dp))

            Card(
                shape = RoundedCornerShape(28.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Column(
                    modifier = Modifier
                        .padding(24.dp)
                ) {

                    Text(
                        text = "Username",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF0D4B73)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = username,
                        onValueChange = {
                            username = it
                        },
                        placeholder = {
                            Text("Masukkan username")
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Password",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF0D4B73)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = password,
                        onValueChange = {
                            password = it
                        },
                        placeholder = {
                            Text("Masukkan password")
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null
                            )
                        },
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.VisibilityOff,
                                contentDescription = null
                            )
                        },
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Forgot Password?",
                        color = Color(0xFF00A8E8),
                        modifier = Modifier.align(Alignment.End)
                    )

                    Spacer(modifier = Modifier.height(28.dp))

                    Button(
                        onClick = {

                        },

                        modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp),

                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),

                        contentPadding = PaddingValues(),

                        shape = RoundedCornerShape(50)
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    brush = Brush.horizontalGradient(
                                        listOf(
                                            Color(0xFF0B4F7A),
                                            Color(0xFF11C5E5)
                                        )
                                    )
                                ),

                            contentAlignment = Alignment.Center
                        ) {

                            Text(
                                text = "Login",
                                color = Color.White,
                                fontSize = 18.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "Don’t have an account?"
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Text(
                            text = "Sign Up",
                            color = Color(0xFFFFB800),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}