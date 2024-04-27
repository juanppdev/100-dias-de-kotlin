package com.mundocode.todoapp.addtasks.domain

import com.mundocode.todoapp.addtasks.data.TaskRepository
import com.mundocode.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}