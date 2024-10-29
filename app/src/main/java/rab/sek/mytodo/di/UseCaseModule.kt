package rab.sek.mytodo.di

import android.view.View
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import rab.sek.mytodo.domain.repository.TodoRepository
import rab.sek.mytodo.domain.usecase.delete.DeleteTodoUseCase
import rab.sek.mytodo.domain.usecase.delete.DeleteTodoUseCaseImpl
import rab.sek.mytodo.domain.usecase.get.GetTodoUseCase
import rab.sek.mytodo.domain.usecase.get.GetTodoUseCaseImpl
import rab.sek.mytodo.domain.usecase.save.SaveTodoUseCase
import rab.sek.mytodo.domain.usecase.save.SaveTodoUseCaseImpl
import rab.sek.mytodo.domain.usecase.update.UpdateTodoUseCase
import rab.sek.mytodo.domain.usecase.update.UpdateTodoUseCaseImpl
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetTodoUseCase(todoRepository: TodoRepository): GetTodoUseCase {
        return GetTodoUseCaseImpl(todoRepository)
    }

    @Provides
    fun provideSaveTodoUseCase(todoRepository: TodoRepository): SaveTodoUseCase {
        return SaveTodoUseCaseImpl(todoRepository)
    }

    @Provides
    fun provideUpdateTodoUseCase(todoRepository: TodoRepository): UpdateTodoUseCase {
        return UpdateTodoUseCaseImpl(todoRepository)
    }

    @Provides
    fun provideDeleteTodoUseCase(todoRepository: TodoRepository): DeleteTodoUseCase {
        return DeleteTodoUseCaseImpl(todoRepository)
    }
}