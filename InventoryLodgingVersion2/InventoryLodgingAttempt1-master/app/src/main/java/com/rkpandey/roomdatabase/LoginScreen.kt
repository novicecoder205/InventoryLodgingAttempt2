package com.rkpandey.roomdatabase


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen (
    navController: NavController,
){
    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(painter = painterResource(id = R.drawable.inventory2), contentDescription = "Login Image",
            modifier = Modifier.size(200.dp))

        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = username, onValueChange = {
            username = it

        }, label = {
            Text(text = "Username")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (authenticate(username, password)){
                Log.i("Credential", "Email: $username Password: $password")
                navController.navigate("NotesScreen")
            } else {
                //
            }
            //Log.i("Credential", "Email: $username Password: $password")
            //navController.navigate("NotesScreen")
        }) {
            Text(text = "Login")
            //navController.navigate("NoteScreen")

        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Forgot Password", modifier = Modifier.clickable {

        })
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Or Sign in with")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.googleicon),
                contentDescription = "Google",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //GOOGLE clicked
                    }
            )

            Image(painter = painterResource(id = R.drawable.facebookicon),
                contentDescription = "FaceBook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Facebook clicked
                    }
            )

            Image(painter = painterResource(id = R.drawable.ssricon),
                contentDescription = "SSR",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //SSR clicked
                    }
            )
        }
    }
}

//Authentication
private fun authenticate(username: String, password: String): Boolean{
    val validUsername = "admin1"
    val validPassword = "adminpassword1"
    return username == validUsername && password == validPassword
}