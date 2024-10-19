package rab.sek.mytodo.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "isChecked") val isChecked: Boolean,
    @ColumnInfo(name = "content") val content: String
)