package com.example.localhanddemo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.localhanddemo.ui.theme.LocalHandDemoTheme
import com.example.localhanddemo.ui.theme.*

@Composable
fun LoginScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = backgroundColor) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 40.dp, vertical = 50.dp)
        ) {
            Text(
                text = "Login",
                color = neutralWhite,
                fontSize = 17.sp,
                fontWeight = FontWeight(600)
            )

            Spacer(modifier = Modifier.height(107.dp))

            Image(
                painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(207.dp)
                    .height(52.dp)
            )

            Spacer(modifier = Modifier.height(48.dp))

            OutlinedTextField(
                modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = neutralBlack,
                    focusedBorderColor = neutralWhite,
                    unfocusedLabelColor = neutral700
                ),
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Email",
                        lineHeight = 20.sp,
                        fontSize = 15.sp,
                        fontWeight = FontWeight(400)
                    )

                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = neutralBlack,
                    focusedBorderColor = neutralWhite,
                    unfocusedLabelColor = neutral700
                ),
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Password",
                        lineHeight = 20.sp,
                        fontSize = 15.sp,
                        fontWeight = FontWeight(400)
                    )
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Forgot Password?",
                color = neutralWhite,
                fontSize = 13.sp,
                fontWeight = FontWeight(600)
            )

            Spacer(modifier = Modifier.height(118.dp))

            OutlinedButton(
                modifier = Modifier
                    .height(38.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(3.dp),
                border = BorderStroke(1.dp, neutralBlack),
                onClick = { /*TODO*/ }) {
                Image(
                    painterResource(id = R.drawable.google),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Continue with Google",
                    fontSize = 13.sp,
                    fontWeight = FontWeight(500),
                    color = neutralWhite
                )
            }

            Spacer(modifier = Modifier.height(118.dp))

            Text(
                text = "Don't have an account?",
                fontSize = 13.sp,
                fontWeight = FontWeight(500),
                color = neutralWhite
            )

            Spacer(modifier = Modifier.height(36.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(44.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(promary),
                shape = RoundedCornerShape(4.dp),
                border = BorderStroke(1.dp, promaryHover)
            ) {
                Text(
                    text = "Log In",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(700),
                    color = neutralWhite
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LocalHandDemoTheme {
        LoginScreen()
    }
}