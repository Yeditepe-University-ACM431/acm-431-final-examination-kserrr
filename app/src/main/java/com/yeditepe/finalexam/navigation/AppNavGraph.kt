package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yeditepe.finalexam.ui.TaskListScreen
import com.yeditepe.finalexam.ui.TaskDetailScreen

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

      
        composable("tasks") {
            TaskListScreen()
        }

        composable(
            route = "taskDetail/{title}",
            arguments = listOf(navArgument("title") { type = NavType.StringType })
        ) { backStackEntry ->
            val title =  backStackEntry.arguments?.getString("title") ?: ""
            TaskDetailScreen ( title = title)
        }

      
    }
}
