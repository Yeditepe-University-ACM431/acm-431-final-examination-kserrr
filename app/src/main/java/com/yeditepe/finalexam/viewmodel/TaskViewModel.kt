package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
private val_tasks = mutableStateOff(
    listOf( Task(id = 1, title = "Submit Final Project", isCompleted = false),
    Task(id = 2, title = "Study for Exam", isCompleted = true)
    )
    )
    val tasks: State<List<Task>> = _tasks

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        fun toggleTask(taskId: Int) { _tasks.value =  _tasks.value.map { task ->
                if (task.id == taskId) {
           task.copy(isCompleted = !task.isCompleted)
                } else {
                    task
                }
            }
        }

    }
}
