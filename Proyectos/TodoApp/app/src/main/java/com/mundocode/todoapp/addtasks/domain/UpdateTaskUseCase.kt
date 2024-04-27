package com.mundocode.todoapp.addtasks.domain

import com.mundocode.todoapp.addtasks.data.TaskRepository
import com.mundocode.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository){
    suspend operator fun invoke(taskMode: TaskModel) {
        taskRepository.update(taskMode)
    }
}