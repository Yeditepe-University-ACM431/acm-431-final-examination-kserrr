package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {
    val tasks = viewModel.tasks.value

    // TODO 3: Read task list from ViewModel

    Column { tasks.forEach { task ->
        Column(
            modifier = Modifier
                .clickable {
                    viewModel.toggleTask(task.id)
                }
        ) {
            Text(text = task.title)
            Text(text = if (task.isCompleted) "Completed" else "Not Completed")
        }
    }
    }


        // TODO 4: Display task titles and completion status
        // Use a simple Column or LazyColumn
    }
}

@Composable
fun TaskRow(task: Task, navController: NavController) {

    Text(
        text = task.title,
        modifier = Modifier.clickable {
            navController.navigate("taskDetail/${task.title}")
           
        }
    )
}


