package com.example.testing.model.datamodel

import androidx.room.*
import java.io.Serializable


@Entity
data class Record(@PrimaryKey val id: Int,@ColumnInfo(name = "image")  val image: Int,@ColumnInfo(name = "name") val name: String,
                  @ColumnInfo(name = "description") val description: String?) : Serializable {
}