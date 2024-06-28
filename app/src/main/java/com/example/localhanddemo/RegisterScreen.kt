package com.example.localhanddemo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.localhanddemo.ui.theme.LocalHandDemoTheme
import com.example.localhanddemo.ui.theme.backgroundColor
import com.example.localhanddemo.ui.theme.neutral500
import com.example.localhanddemo.ui.theme.neutral700
import com.example.localhanddemo.ui.theme.neutralBlack
import com.example.localhanddemo.ui.theme.neutralWhite
import com.example.localhanddemo.ui.theme.promary
import com.example.localhanddemo.ui.theme.promaryHover

@Composable
fun RegisterScreen() {
    var firstName by remember { mutableStateOf("") }
    Scaffold { padding ->

        Column(
            modifier = Modifier
                .background(backgroundColor)
                .fillMaxSize()
                .padding(padding)
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 27.dp, top = 34.dp)
            ) {
                IconButton(onClick = { })
                {
                    Icon(
                        painter = painterResource(id = R.drawable.chevron_left),
                        contentDescription = null,
                        tint = neutral500
                    )
                }

                Spacer(modifier = Modifier.width(86.dp))
                Text(
                    text = "Register",
                    color = neutralWhite,
                    fontSize = 17.sp,
                    fontWeight = FontWeight(600)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(horizontal = 40.dp)
                    .padding(top = 107.dp)

            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OutlinedTextField(
                        value = firstName,
                        onValueChange = { newText -> firstName = newText },
                        modifier = Modifier
                            .weight(1f)
                            .height(40.dp)
                           ,
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = neutralBlack,
                            unfocusedLabelColor = neutral700
                        ),

                        textStyle = TextStyle(
                            lineHeight = 20.sp,
                            fontSize = 15.sp,
                            fontWeight = FontWeight(400),
                            color = neutral700
                        ),
                        keyboardActions = KeyboardActions.Default,
                        label = {
                            Text(
                                text = "First Name",
                                lineHeight = 20.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400)
                            )

                        },
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    OutlinedTextField(
                        modifier = Modifier
                            .weight(1f)
                            .height(40.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = neutralBlack,
                            unfocusedLabelColor = neutral700
                        ),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(
                                text = "Last Name",
                                lineHeight = 20.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400)
                            )

                        }
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = neutralBlack,
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
                        unfocusedLabelColor = neutral700
                    ),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Phone Number",
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

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = neutralBlack,
                        unfocusedLabelColor = neutral700
                    ),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Confirm Password",
                            lineHeight = 20.sp,
                            fontSize = 15.sp,
                            fontWeight = FontWeight(400)
                        )
                    }
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
                        text = "Next",
                        fontSize = 15.sp,
                        fontWeight = FontWeight(700),
                        color = neutralWhite
                    )
                }

                Spacer(modifier = Modifier.height(75.dp))

                Row(
                    modifier = Modifier.wrapContentSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Already have an account?",
                        fontSize = 13.sp,
                        fontWeight = FontWeight(500),
                        color = neutralWhite
                    )

                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = "Sign In",
                            fontSize = 15.sp,
                            fontWeight = FontWeight(700),
                            color = promary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(34.dp))

                OutlinedButton(
                    modifier = Modifier
                        .height(38.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(3.dp),
                    border = BorderStroke(1.dp, neutralBlack),
                    onClick = {}) {
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



                Spacer(modifier = Modifier.height(36.dp))


            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    LocalHandDemoTheme {
        RegisterScreen()
    }
}