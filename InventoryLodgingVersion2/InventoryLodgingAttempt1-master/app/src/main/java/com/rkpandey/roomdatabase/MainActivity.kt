package com.rkpandey.roomdatabase

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.rkpandey.roomdatabase.data.NotesDatabase
import com.rkpandey.roomdatabase.presentation.AddNoteScreen
import com.rkpandey.roomdatabase.presentation.NotesScreen
import com.rkpandey.roomdatabase.presentation.NotesViewModel
import com.rkpandey.roomdatabase.ui.theme.RoomDatabaseTheme

@Suppress("UNCHECKED_CAST")
class MainActivity : ComponentActivity() {

    private val database by lazy {
        Room.databaseBuilder(
            applicationContext,
            NotesDatabase::class.java,
            "notes.db"
        ).build()
    }

    private val viewModel by viewModels<NotesViewModel> (
        factoryProducer = {
            object : ViewModelProvider.Factory {
                override fun<T: ViewModel> create(modelClass: Class<T>): T {
                    return NotesViewModel(database.dao) as T
                }
            }
        }
    )

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //installSplashScreen()
            RoomDatabaseTheme {
                //SEARCH SECTION

                //SEARCH SECTION

                //Navigation Login section
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .paint(
                            painterResource(id = R.drawable.ssricon),
                            contentScale = ContentScale.FillBounds
                        )
                ){
                    val navController = rememberNavController()
                }
                //Navigation Login section

                //MAIN APP section
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val state by viewModel.state.collectAsState()
                    val navController = rememberNavController()
                    //NavHost(navController= navController, startDestination = "NotesScreen") {
                    NavHost(navController= navController, startDestination = "LoginScreen") {
                        composable("LoginScreen"){
                            LoginScreen(
                                navController = navController,
                            )
                        }
                        composable("NotesScreen") {
                            NotesScreen(
                                state = state,
                                navController = navController,
                                onEvent = viewModel::onEvent
                            )
                        }
                        composable("AddNoteScreen") {
                            AddNoteScreen(
                                state = state,
                                navController = navController,
                                onEvent = viewModel::onEvent
                            )
                        }
                    }
                }
                //MAIN APP section
            }
        }
    }
}


