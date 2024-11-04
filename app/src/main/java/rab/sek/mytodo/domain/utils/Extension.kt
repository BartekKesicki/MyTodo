package rab.sek.mytodo.domain.utils

import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.presentation.model.TodoPresentationModel

fun TodoEntity.mapToPresentationModel(): TodoPresentationModel {
    return TodoPresentationModel(id, isChecked, content)
}