package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.model.TaskDto


class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
            val taskDtos = api.getTasks()

            return taskDtos.map { dto ->
                Task(
                    id = dto.id,
                    title = dto.title,
                    isCompleted = dto.completed
                )
            }
        }

        return TODO("Provide the return value")
    }
}
