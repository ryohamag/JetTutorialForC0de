package com.websarva.wings.jettutorialforc0de

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.websarva.wings.jettutorialforc0de.components.DetailScreen
import com.websarva.wings.jettutorialforc0de.components.MainScreen
import com.websarva.wings.jettutorialforc0de.ui.theme.JetTutorialForC0deTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetTutorialForC0deTheme {
                val navController = rememberNavController() //NavControllerのインスタンスを生成(とりあえず必要)
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //遷移先を管理
                    NavHost(navController = navController, startDestination = "MainScreen") {
                        composable(route = "MainScreen") {
                            MainScreen(navController)
                        }
                        //DetailScreenが指定された場合は、DetailScreen()を呼び出す
                        composable(route = "DetailScreen") {
                            DetailScreen()
                        }
                    }
                }
            }
        }
    }
}